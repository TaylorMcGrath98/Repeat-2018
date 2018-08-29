
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("", user)/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
    
    """),format.raw/*5.5*/("""<div class="container-fluid">
            ​​<div class="container">
          <div class="jumbotron">
            <h1 align="center">About us</h1>   
        <hr>	
            <h2 align="center">We are Dublins newest and best rated club </h2>
          <h2></h2>
          </div>
             
        </div>  
    </div> 
    
    

    <div id="panel1" class="panel panel-success ">
            <div class="panel-heading">What does our CEO have to say ?</div>
            <div class="panel-body"><blockquote>
                    <p class="text-success">"A satisfied customer is the best business strategy of all."</p>
                    <footer>Taylor McGrath</footer>
                  </blockquote></div>
          </div>
          
          <div id="panel2" class="panel panel-info text-center">
            <div class="panel-heading">Insiration and Passion</div>
            <div class="panel-body">“I think passion can be split up into drive and determination, maybe even ambition. We’re not all career people, if that was the case, we’d all stay in a safe little world. I had a very good salary before I embarked on my Club business. People who set up their own business are all risk takers, there are times when you are sailing by the seat of your pants with running it all. I think the risks become more measured the more established the business becomes and you have a different confidence. Running your own business is addictive"<blockquote>
                    <p class="text-success"></p>
                    <footer>Jane Doe</footer>
                  </blockquote></div>
            
          </div>
      
          <div id="panel3" class="panel panel-warning text-right">
                <div class="panel-heading">Where are we now ?</div>
                <div class="panel-body">Genesis is now the best selling club an ecomerce site for any Irish club<blockquote>
                        <p class="text-success"></p>
                        <footer>Genesis</footer>
                      </blockquote></div>
            
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
                  DATE: Wed Aug 29 15:55:52 IST 2018
                  SOURCE: /home/wdd/webapps/play-2018-shoppingWithSearch/app/views/about.scala.html
                  HASH: 43cc1d0610c820444e9a72d374dd6b6e855648e7
                  MATRIX: 959->1|1078->27|1105->29|1127->43|1166->45|1202->55
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5
                  -- GENERATED --
              */
          