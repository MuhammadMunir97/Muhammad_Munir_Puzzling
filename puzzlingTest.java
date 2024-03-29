/**
 * puzzlingTest
 */
public class puzzlingTest {

    public static void main(String[] args) {
        puzzling puzzle = new puzzling();
        // Puzzle number 1
        System.out.println("Part 1");
        int [] arr = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(puzzle.greaterThanTen(arr));
        //   Puzzle number 2
        System.out.println("Part 2");
        String[] names = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        System.out.println("Names greater than 5: " + puzzle.greaterThanFive(names)); 

        // Puzzle number 3
        System.out.println("Part 3");
        puzzle.letters();

        // Puzzle number 4
        System.out.println("Part 4");
        System.out.println(puzzle.randNumber());

        // Puzzle number 5
        System.out.println("Part 5");
        System.out.println(puzzle.sortedRandNum());

        // Puzzle number 6
        System.out.println("Part 6");
        System.out.println(puzzle.randString());

        // Puzzle number 7
        System.out.println("Part 7");
        System.out.println(puzzle.randStringArr());
    }
}