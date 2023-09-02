package Hashmap;

import java.util.LinkedList;

public class rawhash {
    static class Hashmap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;

        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public Hashmap(){
            this.x =4;
            this.n = 0;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int x;
        public void put(K key, V value){
        int bi = hasfunction(key);
        int di = SearchinLL(key, bi);
        if(di != -1){
            Node node = buckets[bi].get(di);
            node.value = value;
        }else{
            buckets[bi].add(new Node(key, value));
            n++;
        }
        double lambda = (double)n/x;
        if(lambda <0){
            rehash();
        }
        }

        private void rehash() {
            LinkedList<Node> oldbuck[] = buckets;
            buckets = new LinkedList[x * 2];
            x = 2 *x;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldbuck.length; i++) {
                LinkedList<Node> ll = oldbuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key , node.value );
                }
            }
        }

        public static void main(String[] args) {
            Hashmap<String,Integer> hm = new Hashmap<>();
            hm.put("India", 100);
            hm.put("China" ,40);
            hm.put("Japan",80);
        }
        private int SearchinLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        private int hasfunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) & x;
        }

        public boolean containskey(K key){
            return false;
        }

    }
}
