class  Madagascar {
    String name;
    
    void displayName() {
        System.out.println("Madagascar Name: " + name);
    }
}

public class Sw6sem2 {
    public static void main(String[] args) {
        
        Madagascar m1 = new Madagascar();
        m1.name = "Mort";
        
        try {
            m1.displayName();
        } catch (Exception e) {
            System.out.println("Error: Madagascar object is not created");
        }
    }
}