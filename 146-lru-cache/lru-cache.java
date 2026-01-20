class Node {
    int key, val;
    Node prev, next;
    
    Node(int k, int v) {
        this.key = k;
        this.val = v;
    }
}

class LRUCache {
    private HashMap<Integer, Node> map;
    private Node head, tail;
    private int capacity;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
        
        // Move to front (most recently used)
        moveToHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        
        if (node != null) {
            // Update value and move to front
            node.val = value;
            moveToHead(node);
        } else {
            // Create new node
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToHead(newNode);
            
            // Evict LRU if full
            if (map.size() > capacity) {
                Node lru = tail.prev;
                map.remove(lru.key);
                removeNode(lru);
            }
        }
    }
    
    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }
    
    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
