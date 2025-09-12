/*Create a GameLevel class using constructor overloading with the following conditions:

Constructors:

GameLevel() → creates a default beginner level (Level 1, Theme = "Tutorial", Easy enemies).

GameLevel(int levelNumber) → difficulty increases automatically with level number.

GameLevel(int levelNumber, String theme) → difficulty based on level number and custom theme.

GameLevel(int levelNumber, String theme, boolean bossLevel) → if bossLevel = true, add a Boss Enemy to the list.

Functionalities (Methods students must implement):

generateEnemies() → creates a list of enemies based on level difficulty (e.g., more enemies for higher levels).

displayLevelInfo() → prints details like Level Number, Theme, Difficulty, Enemies, Boss present or not.

calculateDifficulty() → automatically calculates difficulty based on level number and theme.

Trickiness:

Difficulty is not linear; e.g., levels divisible by 5 must be extra hard.

Themes affect difficulty: "Forest" = easy, "Desert" = medium, "Volcano" = hard.

Boss Levels should add +2 difficulty automatically.*/
import java.util.ArrayList;
import java.util.List;

class GameLevel {
    private int levelNumber;
    private String theme;
    private boolean bossLevel;
    private int difficulty;
    private List<String> enemies;

    // Constructor 1: Default Beginner Level
    public GameLevel() {
        this.levelNumber = 1;
        this.theme = "Tutorial";
        this.bossLevel = false;
        this.difficulty = calculateDifficulty();
        this.enemies = generateEnemies();
    }

    // Constructor 2: Level number only
    public GameLevel(int levelNumber) {
        this.levelNumber = levelNumber;
        this.theme = "Default";
        this.bossLevel = false;
        this.difficulty = calculateDifficulty();
        this.enemies = generateEnemies();
    }

    // Constructor 3: Level number + Theme
    public GameLevel(int levelNumber, String theme) {
        this.levelNumber = levelNumber;
        this.theme = theme;
        this.bossLevel = false;
        this.difficulty = calculateDifficulty();
        this.enemies = generateEnemies();
    }

    // Constructor 4: Level number + Theme + Boss flag
    public GameLevel(int levelNumber, String theme, boolean bossLevel) {
        this.levelNumber = levelNumber;
        this.theme = theme;
        this.bossLevel = bossLevel;
        this.difficulty = calculateDifficulty();
        this.enemies = generateEnemies();
    }

    // Method 1: Generate enemies based on difficulty
    public List<String> generateEnemies() {
        List<String> enemies = new ArrayList<>();

        for (int i = 1; i <= difficulty; i++) {
            enemies.add("Enemy_" + i);
        }

        if (bossLevel) {
            enemies.add("Boss Enemy");
        }
        return enemies;
    }

    // Method 2: Display all level info
    public void displayLevelInfo() {
        System.out.println("=== Level Info ===");
        System.out.println("Level Number: " + levelNumber);
        System.out.println("Theme: " + theme);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Boss Level: " + (bossLevel ? "Yes" : "No"));
        System.out.println("Enemies: " + enemies);
        System.out.println("==================\n");
    }

    // Method 3: Calculate difficulty based on rules
    private int calculateDifficulty() {
        int baseDifficulty = levelNumber;

        // Themes affect difficulty
        switch (theme.toLowerCase()) {
            case "forest":
                baseDifficulty += 1; // easy
                break;
            case "desert":
                baseDifficulty += 2; // medium
                break;
            case "volcano":
                baseDifficulty += 3; // hard
                break;
            case "tutorial":
                baseDifficulty = 1;
                break;
            default:
                baseDifficulty += 1; // default small boost
        }

        // Extra hardness for multiples of 5
        if (levelNumber % 5 == 0) {
            baseDifficulty += 3;
        }

        // Boss level increases difficulty
        if (bossLevel) {
            baseDifficulty += 2;
        }

        return baseDifficulty;
    }
}

public class GameDemo {
    public static void main(String[] args) {
        // Using different constructors
        GameLevel level1 = new GameLevel(); // default beginner
        GameLevel level2 = new GameLevel(3); // level 3 default theme
        GameLevel level3 = new GameLevel(7, "Forest"); // custom theme
        GameLevel level4 = new GameLevel(10, "Volcano", true); // Boss level

        // Displaying info
        level1.displayLevelInfo();
        level2.displayLevelInfo();
        level3.displayLevelInfo();
        level4.displayLevelInfo();
    }
}


