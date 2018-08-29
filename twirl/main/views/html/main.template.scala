
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href=""""),_display_(/*13.29*/routes/*13.35*/.Assets.versioned("images/logo.png")),format.raw/*13.71*/("""">

    <title>Genesis - """),_display_(/*15.23*/title),format.raw/*15.28*/("""</title>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
    integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" 
    integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
    <!-- Custom CSS -->
    <link href=""""),_display_(/*26.18*/routes/*26.24*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*26.74*/("""" rel="stylesheet"> 

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
    <!-- Site header and navigation -->
    <header class="top" role="header">
        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*51.52*/routes/*51.58*/.ProductCtrl.listProducts(0)),format.raw/*51.86*/("""">Genesis Store</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href=""""),_display_(/*57.39*/routes/*57.45*/.HomeController.home()),format.raw/*57.67*/("""">Home</a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*60.39*/routes/*60.45*/.HomeController.about()),format.raw/*60.68*/("""">About</a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*63.39*/routes/*63.45*/.HomeController.contact()),format.raw/*63.70*/("""">Contact</a>
                        </li>
                                            <!-- Login/ logout Link - check if user logged in -->
                        <li>
                            """),_display_(/*67.30*/if(user != null)/*67.46*/ {_display_(Seq[Any](format.raw/*67.48*/("""
                                """),format.raw/*68.33*/("""<a href=""""),_display_(/*68.43*/controllers/*68.54*/.security.routes.LoginCtrl.logout()),format.raw/*68.89*/("""">Logout """),_display_(/*68.99*/user/*68.103*/.getName()),format.raw/*68.113*/("""</a>
                            """)))}/*69.31*/else/*69.36*/{_display_(Seq[Any](format.raw/*69.37*/("""
                                """),format.raw/*70.33*/("""<a href=""""),_display_(/*70.43*/controllers/*70.54*/.security.routes.LoginCtrl.login()),format.raw/*70.88*/("""">Login</a>
                            """)))}),format.raw/*71.30*/("""
                        """),format.raw/*72.25*/("""</li>
                        <li>
                            <a href=""""),_display_(/*74.39*/routes/*74.45*/.ShoppingCtrl.showBasket()),format.raw/*74.71*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>
    </header>

    <!-- Page Content -->
    <div class="middle">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p class="lead">"""),_display_(/*89.38*/title),format.raw/*89.43*/("""</p>
                <div>
            </div>

            <!-- Start Content -->
            """),_display_(/*94.14*/content),format.raw/*94.21*/("""
            """),format.raw/*95.13*/("""<!-- End Content -->

        </div>
        <!-- /.container -->
    </div>

    <!-- Footer -->

    <footer class="footer">
            <hr>
            <div class="container-fluid">
                <h3 style="text-align:center">Follow us on Social Media</h3>
            
              <div class="row">
                
              <div class="col-sm-2"><a href="https://www.facebook.com/"><img src=""""),_display_(/*110.84*/routes/*110.90*/.Assets.versioned("images/Facebookicon.png")),format.raw/*110.134*/("""" alt="1"></a></div>
              <div class="col-sm-2"><a href="https://www.plus.google.com/"><img src=""""),_display_(/*111.87*/routes/*111.93*/.Assets.versioned("images/googleplusicon.png")),format.raw/*111.139*/("""" alt="3"></a></div>
              <div class="col-sm-2"><a href="https://www.youtube.com/"><img src=""""),_display_(/*112.83*/routes/*112.89*/.Assets.versioned("images/youtubeicon.png")),format.raw/*112.132*/("""" alt="4"></a></div>
              <div class="col-sm-2"><a href="https://www.twitter.com/"><img src=""""),_display_(/*113.83*/routes/*113.89*/.Assets.versioned("images/twittericon.png")),format.raw/*113.132*/("""" alt="2"></a></div>
              <div class="col-sm-2"><a href="https://www.pinterest.com/"><img src=""""),_display_(/*114.85*/routes/*114.91*/.Assets.versioned("images/pintresticon.png")),format.raw/*114.135*/("""" alt="5" ></a></div>
              <div class="col-sm-2"><a href="https://www.flickr.com/"><img src=""""),_display_(/*115.82*/routes/*115.88*/.Assets.versioned("images/flickricon.png")),format.raw/*115.130*/("""" alt="7"></a></div>
              
                
              
              </div>
            </div>
        </footer>

   
    
    <!-- jQuery -->
<script
  src="https://code.jquery.com/jquery-2.2.4.min.js"
  integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
  crossorigin="anonymous"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 29 04:43:36 IST 2018
                  SOURCE: /home/wdd/webapps/play-2018-shoppingWithSearch/app/views/main.scala.html
                  HASH: 87ef966a9e576dbd335c802e05161ea8528541c9
                  MATRIX: 970->1|1119->57|1146->58|1478->363|1493->369|1550->405|1603->431|1629->436|2233->1013|2248->1019|2319->1069|3566->2289|3581->2295|3630->2323|3990->2656|4005->2662|4048->2684|4183->2792|4198->2798|4242->2821|4378->2930|4393->2936|4439->2961|4666->3161|4691->3177|4731->3179|4792->3212|4829->3222|4849->3233|4905->3268|4942->3278|4956->3282|4988->3292|5041->3327|5054->3332|5093->3333|5154->3366|5191->3376|5211->3387|5266->3421|5338->3462|5391->3487|5491->3560|5506->3566|5553->3592|6036->4048|6062->4053|6184->4148|6212->4155|6253->4168|6689->4576|6705->4582|6772->4626|6907->4733|6923->4739|6992->4785|7123->4888|7139->4894|7205->4937|7336->5040|7352->5046|7418->5089|7551->5194|7567->5200|7634->5244|7765->5347|7781->5353|7846->5395
                  LINES: 28->1|33->2|34->3|44->13|44->13|44->13|46->15|46->15|57->26|57->26|57->26|82->51|82->51|82->51|88->57|88->57|88->57|91->60|91->60|91->60|94->63|94->63|94->63|98->67|98->67|98->67|99->68|99->68|99->68|99->68|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|101->70|102->71|103->72|105->74|105->74|105->74|120->89|120->89|125->94|125->94|126->95|141->110|141->110|141->110|142->111|142->111|142->111|143->112|143->112|143->112|144->113|144->113|144->113|145->114|145->114|145->114|146->115|146->115|146->115
                  -- GENERATED --
              */
          