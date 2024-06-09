var queenDiamonds = 10
// queenDiamonds: Int = 10
var threeClubs = 3
// threeClubs: Int = 3
var aceHearts = 1
// aceHearts: Int = 1
var fiveSpades = 5
// fiveSpades: Int = 5
var kingHearts = 10
// kingHearts: Int = 10
var jackHearts = 10
// jackHearts: Int = 10

def maxHand(handA: Int, handB: Int): Int = {
  if (handA > handB) handA
  else handB
}

// Calculate hand values
var handPlayerA: Int = queenDiamonds + threeClubs + aceHearts + fiveSpades
// handPlayerA: Int = 19
var handPlayerB: Int = kingHearts + jackHearts
// handPlayerB: Int = 20

// Find and print the maximum hand value
println(maxHand(handPlayerA, handPlayerB))
// 20

// * Create and parameterize an array for a round of Twenty-One
// `Array`: mutable sequence of objects with the same type
// `List`: immutable sequence of objects with the same type
val hands: Array[Int] = new Array[Int](3) //Array(0, 0, 0)
// hands: Array[Int] = [I@428b4618

var tenClubs = 10
// tenClubs: Int = 10
var fourDiamonds = 4
// fourDiamonds: Int = 4
var nineSpades = 9
// nineSpades: Int = 9
var nineHearts = 9
// nineHearts: Int = 9
var twoClubs = 2
// twoClubs: Int = 2
var threeSpades = 3
// threeSpades: Int = 3

// Initialize the first player's hand in the array
hands(0) = tenClubs + fourDiamonds

// Initialize the second player's hand in the array
hands(1) = nineSpades + nineHearts

// Initialize the third player's hand in the array
hands(2) = twoClubs + threeSpades

val hands2 = Array(
  tenClubs + fourDiamonds,
  nineSpades + nineHearts,
  twoClubs + threeSpades
) // Array(14, 18, 5)
// hands2: Array[Int] = [I@4d6d0223

// Initialize player's hand and print out hands before each player hits
hands(0) = tenClubs + fourDiamonds
hands(1) = nineSpades + nineHearts
hands(2) = twoClubs + threeSpades
hands.foreach(println)
// 14
// 18
// 5

var fiveClubs = 5
// fiveClubs: Int = 5
var queenSpades = 10
// queenSpades: Int = 10
var kingClubs = 10
// kingClubs: Int = 10

// Add 5♣ to the first player's hand
hands(0) = hands(0) + fiveClubs

// Add Q♠ to the second player's hand
hands(1) = hands(1) + queenSpades

// Add K♣ to the third player's hand
hands(2) = hands(2) + kingClubs

// Print out hands after each player hits
hands.foreach(println)
// 19
// 28
// 15

// Initialize a list with an element for each round's prize
val prizes = List(10, 15, 20, 25, 30)
// prizes: List[Int] = List(10, 15, 20, 25, 30)
println(prizes)
// List(10, 15, 20, 25, 30)

// Prepend to prizes to add another round and prize
val newPrizes = 5 :: prizes
// newPrizes: List[Int] = List(5, 10, 15, 20, 25, 30)
println(newPrizes)
// List(5, 10, 15, 20, 25, 30)

// Initialize a list with an element each round's prize
val prizes2 = 10 :: 15 :: 20 :: 25 :: 30 :: Nil
// prizes2: List[Int] = List(10, 15, 20, 25, 30)
println(prizes2)
// List(10, 15, 20, 25, 30)

// The original NTOA and EuroTO venue lists
val venuesNTOA = List("The Grand Ballroom", "Atlantis Casino", "Doug's House")
// venuesNTOA: List[String] = List(The Grand Ballroom, Atlantis Casino, Doug's House)
val venuesEuroTO = "Five Seasons Hotel" :: "The Electric Unicorn" :: Nil
// venuesEuroTO: List[String] = List(Five Seasons Hotel, The Electric Unicorn)

// Concatenate the North American and European venues
val venuesTOWorld = venuesNTOA ::: venuesEuroTO
// venuesTOWorld: List[String] = List(The Grand Ballroom, Atlantis Casino, Doug's House, Five Seasons Hotel, The Electric Unicorn)
