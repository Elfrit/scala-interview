package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap {

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")

  val namesInDepartments:scala.collection.mutable.Map[String, List[String]] ={
  devNames.foreach(i =>
            devDepartments.foreach(j =>
              if (namesInDepartments.contains(j._2)==false && (j._1.equals(i._1))){
                namesInDepartments = namesInDepartments + (j._2->List(i._2))
              }
              else if(j._1.equals(i._1)){
                 namesInDepartments(j._2) = namesInDepartments(j._2):::List(i._2)
              }
            )
  )
 }
}
