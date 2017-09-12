package com.example.scala

import com.example.domain.Dept

object DeptExample {

	def main(args: Array[String]): Unit = {

		var dept = new Dept(10, "xxx", "yyy")
		
		println(dept)
		println(dept.getDeptno)
	}

}
