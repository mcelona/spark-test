package com.runads

import org.apache.spark.SparkConf

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))

    var file = "https://s3.amazonaws.com/runadtag-logs-v2/adgear/dt%3D20151019/h%3D2015101901/2015101901.json"

    val conf = new SparkConf().setAppName("Simple Application").setMaster("local")
    //val hadoopConf = sparkContext.hadoopConfiguration

  }

}
