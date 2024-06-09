val xs = 1 to 10 by 2
// xs: Range = inexact Range 1 to 10 by 2

val mults = xs.map(_ * 2)
// mults: IndexedSeq[Int] = Vector(2, 6, 10, 14, 18)

mults.foreach(println)
// 2
// 6
// 10
// 14
// 18
