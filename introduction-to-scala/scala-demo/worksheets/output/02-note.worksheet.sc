val difference = 8 - 5
// difference: Int = 3
println(difference)
// 3

// * `val` are immutable, which means once initialized, they can't be reassigned.
// * `var` are mutable and can be reassigned.

// * Define immutable variables for clubs 2♣ through 4♣
val twoClubs: Int = 2
// twoClubs: Int = 2
val threeClubs: Int = 3
// threeClubs: Int = 3
val fourClubs: Int = 4
// fourClubs: Int = 4

// * Define immutable variables for player names
val playerA: String = "Alex"
// playerA: String = Alex
val playerB: String = "Chen"
// playerB: String = Chen
val playerC: String = "Umberto"
// playerC: String = Umberto

// * playerC = "Umberto" // Reassignment to val playerC error!
// * Note: Reassignment error is Error at compile-time which cannot be handling at run-time

// * Define mutable variables for all aces
var aceClubs = 1
// aceClubs: Int = 1
var aceDiamonds = 1
// aceDiamonds: Int = 1
var aceHearts = 1
// aceHearts: Int = 1
var aceSpades = 1
// aceSpades: Int = 1

// * Create a mutable variable for player A (Alex)
// var playerA = "Alex"

// Change the point value of A♦ from 1 to 11
aceDiamonds = 11
var jackClubs = 10
// jackClubs: Int = 10

// Calculate hand value for J♣ and A♦
println(jackClubs + aceDiamonds)
// 21
