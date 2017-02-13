package scala.slick.driver


import java.util.UUID
import scala.slick.ql._
import scala.slick.session.{PositionedResult, PositionedParameters}
import scala.slick.ast.Node
import scala.slick.util.ValueLinearizer


object Main {

  // this is a class that represents the table I've created in the database
  class Users(tag: Tag) extends Table[(Int, String)](tag, "gdw_func.fin_radar_fin_typ_dim") {
    def radar_fin_typ_dim_id = column[Int]("radar_fin_typ_dim_id")
    def financial_data_type = column[String]("financial_data_type")
    def * = (radar_fin_typ_dim_id, financial_data_type)
  }

  def main(args: Array[String]): Unit = {

    // my database server is located on the localhost
    // database name is "my-db"
    // username is "postgres"
    // and password is "postgres"
    val connectionUrl = "jdbc:postgresql://localhost/bdtbasr2n10.svr.emea.jpmchase.net?user=o649367&password=Neveroddoreven@1"

    Database.forURL(connectionUrl, driver = "org.postgresql.Driver") withSession {
      implicit session =>
        val users = TableQuery[Users]

        // SELECT * FROM users
        users.list foreach { row =>
          println("user with id " + row._1 + " has financial_data_type " + row._2)
        }

        // SELECT * FROM users WHERE username='john'
        users.filter(_.financial_data_type === "CSA").list foreach { row =>
          println("user whose financial_data_type is 'CSA' has id "+row._1 )
        }
    }
  }
}
