
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("", user)/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<head>
            <!-- Theme Made By www.w3schools.com - No Copyright -->
            <title>Bootstrap Theme Company Page</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            
          </head>
          <body>
          
          <div class="jumbotron text-center">
            <h1>Contacts Us</h1>
                <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Get in Touch <span class="glyphicon glyphicon-signal logo"></span></button>
                
                <!-- Modal -->
            <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h3 class="modal-title"><b>Contact Genesis</b></h3>
                </div>
                <div class="modal-body">
                    <p><b>Call Us directly</b></p>
                    <h4>Tel: +353 1 404 1998 - Fax: +353 1 404 2777</h4>
                    <p><b>Email Us</b></p>
                    <h4>Manager@products.com</h4>
                    <p><b>Social Media platforms</b></p>
                    <h4>Facebook, Instagram, Twitter, GooglePlus</h4>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
                </div>
            </div>
            </div>

                <h2>Subscribe to our news letter</h2> 
            <p>We'll update you on new events and deals!</p> 
            <form class="form-inline">
              <div class="input-group">
                <input type="email" class="form-control" size="50" placeholder="Email Address" required>
                <div class="input-group-btn">
                  <button type="button" class="btn btn-danger">Subscribe</button>
                </div>
              </div>
            </form>
          </div>
          
          
          <!-- Container (Services Section) -->
          <div class="container-fluid text-center">
            <h2>SERVICES</h2>
            <h4>What we offer</h4>
            <br>
            <div class="row">
              <div class="col-sm-4">
                <span class="glyphicon glyphicon-off"></span>
                <h4>POWER</h4>
                <p>We dont stop working until youre satisfied</p>
              </div>
              <div class="col-sm-4">
                <span class="glyphicon glyphicon-heart"></span>
                <h4>LOVE</h4>
                <p>We Love what you have to say, tell us</p>
              </div>
              <div class="col-sm-4">
                <span class="glyphicon glyphicon-lock"></span>
                <h4>JOB DONE</h4>
                <p>What ever your party needs we have a solution</p>
              </div>
            </div>
            <br><br>
            <div class="row">
              <div class="col-sm-4">
                <span class="glyphicon glyphicon-envelope"></span>                              
                <h4>MAIL US</h4>
                <p>Manager@products.com</p>
              </div>
              <div class="col-sm-4">
                <span class="glyphicon glyphicon-print"></span>
                <h4>PRINT TICKETS</h4>
                <p>Our representitives will print your tickets for you</p>
              </div>
              <div class="col-sm-4">
                <span class="glyphicon glyphicon-search"></span>
                <h4 style="color:#303030;">HARD WORK</h4>
                <p>We'll do our best to help you find you perfect party</p>
              </div>
            </div>
          </div>

          </body>

     
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 29 04:44:17 IST 2018
                  SOURCE: /home/wdd/webapps/play-2018-shoppingWithSearch/app/views/contact.scala.html
                  HASH: 88c20c1157c17d735a73fa9cf34374c3019b6949
                  MATRIX: 961->1|1080->27|1107->29|1129->43|1168->45|1199->50
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          