
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("", user)/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
     
    """),format.raw/*5.5*/("""​​<div class="container">
            <div class="jumbotron">
              <h1 align="center">Home</h1>   
          <hr>	
              <h2 align="center"><b>Sign Up for Free</b></h2>
              
            </div>
               
          </div>

          <div id="homeimg"class="container-fluid">
            
        
          <div class="row">
            
          <div class="col-sm-3"><img src=""""),_display_(/*20.44*/routes/*20.50*/.Assets.versioned("images/seaside.jpg")),format.raw/*20.89*/("""" alt="1"></div>
          <div class="col-sm-3"><img src=""""),_display_(/*21.44*/routes/*21.50*/.Assets.versioned("images/MoneyMaker.jpg")),format.raw/*21.92*/("""" alt="2"></a></div>
          <div class="col-sm-3"><img src=""""),_display_(/*22.44*/routes/*22.50*/.Assets.versioned("images/discJockey.jpg")),format.raw/*22.92*/("""" alt="3"></div>
          <div class="col-sm-3"><img src=""""),_display_(/*23.44*/routes/*23.50*/.Assets.versioned("images/TheGambler.jpg")),format.raw/*23.92*/("""" alt="3"></div>
          
          </div>
        </div>
  
        <div id="box1"><h3>Come Join us for all the best deals and events across our beautiful club. We offer deals and offers to suit all needs so visit our Genesis Store and find all of our tickets for upcoming events, Deals and much more.</h3></div>
        

</div>
           
   
     
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
                  DATE: Wed Aug 29 17:02:29 IST 2018
                  SOURCE: /home/wdd/webapps/play-2018-shoppingWithSearch/app/views/home.scala.html
                  HASH: 3b31d1098f5816d62da2a95da64f5a49900bd3f1
                  MATRIX: 958->1|1077->27|1104->29|1126->43|1165->45|1202->56|1641->468|1656->474|1716->513|1803->573|1818->579|1881->621|1972->685|1987->691|2050->733|2137->793|2152->799|2215->841
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23
                  -- GENERATED --
              */
          