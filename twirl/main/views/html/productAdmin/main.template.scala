
package views.html.productAdmin

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

    <title>Genesis - """),_display_(/*14.23*/title),format.raw/*14.28*/("""</title>

    <!-- Bootstrap Core CSS -->
    <link href=""""),_display_(/*17.18*/routes/*17.24*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*17.74*/("""" rel="stylesheet">

    <!-- Custom CSS -->
    <link href=""""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*20.74*/("""" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

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
                <a class="navbar-brand" href=""""),_display_(/*44.48*/routes/*44.54*/.AdminProductCtrl.listProducts(0)),format.raw/*44.87*/("""">Genesis Store</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
					<!-- Login/ logout Link - check if user logged in -->
                    <li>
						"""),_display_(/*51.8*/if(user != null)/*51.24*/ {_display_(Seq[Any](format.raw/*51.26*/("""
						  """),format.raw/*52.9*/("""<a href=""""),_display_(/*52.19*/controllers/*52.30*/.security.routes.LoginCtrl.logout()),format.raw/*52.65*/("""">Logout """),_display_(/*52.75*/user/*52.79*/.getName),format.raw/*52.87*/("""</a>
						""")))}/*53.9*/else/*53.14*/{_display_(Seq[Any](format.raw/*53.15*/("""
                      	  """),format.raw/*54.26*/("""<a href=""""),_display_(/*54.36*/controllers/*54.47*/.security.routes.LoginCtrl.login()),format.raw/*54.81*/("""">Login</a>
						""")))}),format.raw/*55.8*/("""
                    """),format.raw/*56.21*/("""</li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">
			<div class="row">

				<div class="col-md-12">
						<p class="lead">Our Store</p>
				<div>
			</div>

			<!-- Start Content -->
			"""),_display_(/*74.5*/content),format.raw/*74.12*/("""
			"""),format.raw/*75.4*/("""<!-- End Content -->

    </div>
    <!-- /.container -->

    <div class="container">

        <hr>

        <!-- Footer -->
        <div class="bottom">
            <div class="container">
                <hr>
                <footer>
                    <div class="row">
                        <div class="col-lg-12">
                            <p><b>Follow Us on Social Media</b></p>
                            
                        </div>
                    </div>
                </footer>
            </div>

    </div>
    
    <!-- /.container -->

    <!-- jQuery -->
    <script src=""""),_display_(/*103.19*/routes/*103.25*/.Assets.versioned("javascripts/jquery.js")),format.raw/*103.67*/(""""></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*106.19*/routes/*106.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*106.74*/(""""></script>

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
                  DATE: Tue Aug 28 22:45:49 IST 2018
                  SOURCE: /home/wdd/webapps/play-2018-shoppingWithSearch/app/views/productAdmin/main.scala.html
                  HASH: 85c8d12867e1f158d2ebcd8f2d4bcaa0d751c49d
                  MATRIX: 983->1|1132->57|1159->58|1486->358|1512->363|1598->422|1613->428|1684->478|1773->540|1788->546|1859->596|2979->1689|2994->1695|3048->1728|3415->2069|3440->2085|3480->2087|3516->2096|3553->2106|3573->2117|3629->2152|3666->2162|3679->2166|3708->2174|3738->2187|3751->2192|3790->2193|3844->2219|3881->2229|3901->2240|3956->2274|4005->2293|4054->2314|4413->2647|4441->2654|4472->2658|5104->3262|5120->3268|5184->3310|5282->3380|5298->3386|5369->3435
                  LINES: 28->1|33->2|34->3|45->14|45->14|48->17|48->17|48->17|51->20|51->20|51->20|75->44|75->44|75->44|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|85->54|86->55|87->56|105->74|105->74|106->75|134->103|134->103|134->103|137->106|137->106|137->106
                  -- GENERATED --
              */
          