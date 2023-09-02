package Hashmap;

import java.util.ArrayList;

public class map <K,V> {
    ArrayList<MapNode<K, V>> buckets;
    int size ;
    int numbuckets;
    public map() {
        numbuckets = 20;
        buckets = new ArrayList<>();
        for (int i = 0; i < numbuckets; i++) {
            buckets.add(null);
        }
    }
    private int getBucketIndex(K key){
        int hashcode = key.hashCode();
        return hashcode % numbuckets;
    }
    public void insert(K key , V value){
        int bucketindex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketindex) ;
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        MapNode<K, V> newElementNode = new MapNode<K, V>(key, value);
    }

}
