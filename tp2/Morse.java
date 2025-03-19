public class Morse{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Any arguments.");
            return;
        }
        
        var rt = new StringBuilder();
        for (var arg : args) {
            rt.append(arg);
            rt.append(" Stop. ");
        }
        
        System.out.println(rt);
    }
}
