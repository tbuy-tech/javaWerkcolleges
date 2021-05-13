package oefening2;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Som hup = new Som(input.getLi(),input.getRe());
        try {
            System.out.println(hup.bereken());
        } catch (BuitenException e) {
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
