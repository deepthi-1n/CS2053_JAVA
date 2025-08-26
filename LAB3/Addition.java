class Addition {
    public int add(int a , int b){
        return a + b;
    }
    public float add(float a, float b ){
        return a + b;
    }
    public static void main(String[] args) {
        Addition calc = new Addition();
        System.out.println("Int sum: " + calc.add(3, 7));        
        System.out.println("Float sum: " + calc.add(3.5f, 2.5f)); 
    }

}
