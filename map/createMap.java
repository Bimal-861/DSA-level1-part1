import java.util.LinkedList;
import java.util.ArrayList;

public class createMap {
    public static class HashMap<K,V>{
        private class HMnode{

            K key;
            V value;
            HMnode(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int size;
        private LinkedList<HMnode>[] buckets; 
        int N=4;
        public HashMap(){
            
            initBucket(N);
            size=0;
        }
        private void initBucket(int N){
            buckets=new LinkedList[N];
            for (int bi=0;bi<buckets.length;++bi){
                buckets[bi]=new LinkedList<>();
            }
        }
         private int getIndexInBucket(K key,int bi){
            int di=0;
            for(HMnode Node:buckets[bi]){
                if(Node.key.equals(key)){
                    return di;
                }
                di++;
            }
            return -1;
        }
        private int hashFn(K key){
            int hc =key.hashCode();
            int abshc=Math.abs(hc);

            return (abshc % buckets.length);
        }
        private void reHash()throws Exception{
           LinkedList<HMnode>[] tBuckets=buckets;
          
           initBucket(tBuckets.length*2);
           size=0;
           
            for(int bi=0;bi<tBuckets.length;++bi){
                for(HMnode node:tBuckets[bi]){
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value)throws Exception{
            int bi=hashFn(key);
            int di=getIndexInBucket(key,bi);
            if(di!=-1){
                HMnode node=buckets[bi].get(di);
                node.value=value;
            }else{
                HMnode node=new HMnode(key,value);
                buckets[bi].add(node);
                size++;
            }

            double lambda=size*1.0/buckets.length;
            if(lambda>2.0){
                reHash();
            }

            
        }
        public boolean containsKey(K key)throws Exception{
            int bi=hashFn(key);
            int di=getIndexInBucket(key,bi);
            if(di!=-1){
                return true;
            }else{
               return false;
            }   
        }
        public V get(K key){
            int bi=hashFn(key);
            int di=getIndexInBucket(key,bi);

            if(di!=-1){
                return buckets[bi].get(di).value;
            }else{
                return null;
            }
        }
        public V remove(K key){
            int bi=hashFn(key);
            int di=getIndexInBucket(key,bi);

            if(di!=-1){
                HMnode node=buckets[bi].get(di);
                buckets[bi].remove(di);size--;
                return node.value;
            }else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            
            ArrayList<K> arr=new ArrayList<>();
            for(int bi=0;bi<buckets.length;++bi){
                for(HMnode node:buckets[bi]){
                    arr.add(node.key);
                }
            }
            return arr;
        }

        public int size(){
            return size;
        }

      
    }
    public static void main(String [] args)throws Exception{
        HashMap<String,Integer> s=new HashMap<>();
        s.put("Bimal",5);
        System.out.println(s.get("Bimal"));
        System.out.println(s.containsKey("Bimal"));
        System.out.println(s.containsKey("Maity"));
    }

}
