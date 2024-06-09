import scala.compiletime.ops.boolean
var sevenClubs = 7
var kingDiamonds = 10
var fourSpades = 4

// Point value of a player's hand
val hand = sevenClubs + kingDiamonds + fourSpades

// Congratulate the player if they have reached 21
if (hand == 21) {
  println("Twenty-One!")
}

var threeSpades = 3

// Point value of a player's hand
val hand2 = sevenClubs + kingDiamonds + threeSpades

// Inform a player where their current hand stands
val informPlayer: String = {
  if (hand2 > 21)
    "Bust! :("
  else if (hand2 == 21)
    "Twenty-One! :)"
  else
    "Hit or stay?"
}

// Print the message
print(informPlayer)

def bust(hand: Int): Boolean = {
  if (hand > 21) true
  else false
}

// Find the number of points that will cause a bust
def pointsToBust(hand: Int): Int = {
  // If the hand is a bust, 0 points remain
  if (bust(hand))
    0
  // Otherwise, calculate the difference between 21 and the current hand
  else
    21 - hand
}

var tenSpades = 10
var fiveClubs = 5

// Test pointsToBust with 10♠ and 5♣
val myHandPointsToBust = pointsToBust(tenSpades + fiveClubs)
println(myHandPointsToBust)

// * While loop
// Define counter variable
var i = 0

// Define the number of loop iterations
val numRepetitions = 3

// Loop to print a message for winner of the round
while (i < numRepetitions) {
  if (i < 2)
    println("winner")
  else
    println("chicken dinner")
  // Increment the counter variable
  i = i + 1
}

// Define counter variable
var i2 = 0

// Create list with five hands of Twenty-One
var hands = List(16, 21, 8, 25, 4)

// Loop through hands
while (i2 < hands.length) {
  // Find and print number of points to bust
  println(pointsToBust(hands(i)))
  // Increment the counter variable
  i2 += 1
}

// * for loop
def printlnPointsToBust(hand: Int) = {
  // If the hand is a bust, 0 points remain
  if (bust(hand))
    println(0)
  // Otherwise, calculate the difference between 21 and the current hand
  else
    println(21 - hand)
}

// Loop through hands, finding each hand's number of points to bust
var hands2 = List(16, 21, 8, 25, 4)
hands2.foreach(printlnPointsToBust)
