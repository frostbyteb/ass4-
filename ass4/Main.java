public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("010101010101010010101001");
        System.out.println("The love power of programmer: " + programmer.getLovePower().binStr);
        LoveableAdapterImpl adaptedProgrammerLove = new LoveableAdapterImpl(programmer);
        System.out.println("The love power of programmer: " + adaptedProgrammerLove.getLovePower());

        // Modify love power
        programmer.setLovePower("110011001100110011001100");
    }
}
