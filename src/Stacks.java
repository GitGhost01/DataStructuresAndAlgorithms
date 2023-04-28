import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.isEmpty());

        stack.push(("Minecraft"));
        stack.push(("Borderlands"));
        stack.push(("Skyrim"));
        stack.push(("COD"));

        System.out.println(stack);

        String myFavGame = stack.pop();
        System.out.println(myFavGame);

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.search("Minecraft"));
        //search will return -1 if item is not in the stack

        for (int i = 0; i < 100000000; i++){
            stack.push("Fallout 76");
        }
        System.out.println(stack);
        //will produce an error as a stack can only store so much

    }


}
