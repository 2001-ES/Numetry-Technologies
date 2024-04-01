public class OuterClass {
    
    private int outerField = 30;
    
    public void outerMethod() {
        System.out.println("Outer method");
    }
    
    public class InnerClass {
        
        private int innerField = 50;
        public void innerMethod() {
            System.out.println("Inner method");
            System.out.println("Outer field accessed from inner class: " + outerField);
            outerMethod();
        }
    }
    
    public static void main(String[] args) {
        
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.innerMethod();
    }
}
