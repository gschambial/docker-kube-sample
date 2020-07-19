package sample.docker.kube.entities

import slick.lifted.Tag
import slick.model.{Column, QualifiedName, Table}



class Blogs extends Table("blogs", Seq(Column("id", QualifiedName(), "varchar", false))){

  def id = column[Int]
}
