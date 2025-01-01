## Magical Arena Game

## How to Run

### Prerequisites
- Java 8 or higher
- JUnit 5
 ### Installing JUnit - 5
 1. Download JUnit - 5

    [JUnit Platform Console Standalone JAR](https://github.com/junit-team/junit5/releases)

### Compilation
1. Compile the code:
   ```sh
   javac Main.java Player.java Arena.java Fight.java Dice.java
### Running the Game

2. Run the game:
   ```sh 
   java Main 
## How to Run Tests
### Compilation
1. Compile the tests:
   ```sh
   javac -cp .:junit-5.7.0.jar PlayerTest.java FightTest.java ArenaTest.java
### Running Tests
2. Run the tests:
   ```sh
   java -cp .:junit-5.7.0.jar org.junit.jupiter.api.Assertions PlayerTest FightTest ArenaTest
## Code Structure
- **Player.java:** Represents a player with health, strength, and attack attributes.

- **Dice.java:** Simulates a 6-sided dice roll.

- **Fight.java:** Manages a single round of attack between two players.

- **Arena.java:** Manages the overall fight between two players.

- **Main.java:** Entry point to start the game.

- **PlayerTest.java:** Unit tests for the Player class.

- **FightTest.java:** Unit tests for the Fight class.

- **ArenaTest.java:** Unit tests for the Arena class.

### Explanation:
1. **PlayerTest.java**:
    - Tests player initialization, health reduction, and player death.

2. **FightTest.java**:
    - Tests fight execution to ensure the defender's health is reduced.
    - Tests a scenario where no damage is dealt due to high defense.

3. **ArenaTest.java**:
    - Tests overall fight outcomes ensuring one player is dead.
    - Tests specific scenarios where one player is stronger and wins.

**This task ensures thorough testing of the main functionalities and maintains clarity and Magical Arena**
