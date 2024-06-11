import java.util.HashMap;
import java.util.LinkedList;

class LRUCache {
    int capacity;
    LinkedList<Integer> linkedList;
    HashMap<Integer, LinkedList<Integer>> cacheMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.linkedList = new LinkedList<>();
    }

    public int get(int key) {
        LinkedList<Integer> node = cacheMap.get(key);
        if(node != null) {
            Integer val = node.get(key);
            node.remove(key);
            node.addFirst(val);
            cacheMap.put(key, node);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {

    }
}

    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */

//    least recently used.
//
//
//
//        LRUCache lRUCache = new LRUCache(2);
//lRUCache.put(1, 1); // cache is {1=1}
//        lRUCache.put(2, 2); // cache is {1=1, 2=2}
//        lRUCache.get(1);    // return 1
//        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//        lRUCache.get(2);    // returns -1 (not found)
//        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//        lRUCache.get(1);    // return -1 (not found)
//        lRUCache.get(3);    // return 3
//        lRUCache.get(4);    // return 4
//
//        Papaya Global to Everyone (14 Jan 2024, 5:59 PM)
