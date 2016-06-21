<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"><!--Bootstrap 不支持 IE 古老的兼容模式。为了让 IE 浏览器运行最新的渲染模式下-->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"><!--移动设备支持,禁止缩放-->
    <title>学生管理系统</title>
    <!-- Bootstrap -->
    <link href="./bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link type="text/css" href="./css/my.css" rel="stylesheet"/>
</head>
<body>
<s:iterator value="#session.menusList" var="menus">
      <s:property value="#menus.name"/>
</s:iterator>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">
                <img alt="Brand"  id = "img-size"class="img-rounded img-responsive" src="./image/my-icon.jpg">
            </a>
            <a class="navbar-brand" href="#">学生管理系统</a>


        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <form class="navbar-form navbar-left" role="search" action = "search.php" method = "post">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search" name = "keys">
                </div>

                <button type="submit" class="btn btn-default">查找</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="http://localhost/projects/blog2.0/controller/home.php">我的博客</a></li>
                        <li><a href="http://localhost/projects/blog2.0/controller/write.php">写博客</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
                <li><a href="#" class="dropdown-toggle" role="button" aria-expanded="false">欢迎您,<s:property value="#session.user.name"/></a></li>
                <li>
                    <a class="navbar-brand">
                        <img alt="Brand"  id = "img-size"class="img-circle img-responsive" src="./image/my-icon.jpg">
                    </a>
                </li>
                <li><a href="loginout.action" class="dropdown-toggle" role="button" aria-expanded="false">EXIT</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="container-fluid">

    <div class="row">

        <div class="col-md-4">
		     <ul class="nav nav-tabs">
		      <li><a href="#home" data-toggle="tab">一卡通</a></li>
		      <li><a href="#profile" data-toggle="tab">图书馆</a></li>
		      <li><a href="#messages" data-toggle="tab">个人信息</a></li>
		      <li><a href="#settings" data-toggle="tab">设置</a></li>
		     </ul>
		     
		     
		     <div class="tab-content">
			  <div class="tab-pane active" id="home">
			      <div class="list-group">
					  <a href="#" class="list-group-item list-group-item-success">Dapibus ac facilisis in</a>
					  <a href="#" class="list-group-item list-group-item-success">Dapibus ac facilisis in</a>
					  <a href="#" class="list-group-item list-group-item-success">Dapibus ac facilisis in</a>
					  <a href="#" class="list-group-item list-group-item-success">Dapibus ac facilisis in</a>
				  </div>
			  </div>
			  <div class="tab-pane" id="profile">
			      <div class="list-group">
			          <a href="#" class="list-group-item list-group-item-info">Cras sit amet nibh libero</a>
			          <a href="#" class="list-group-item list-group-item-info">Cras sit amet nibh libero</a>
					  <a href="#" class="list-group-item list-group-item-info">Cras sit amet nibh libero</a>
					  <a href="#" class="list-group-item list-group-item-info">Cras sit amet nibh libero</a>
					</div>
			  </div>
			  <div class="tab-pane" id="messages">
			      <s:url var="userinfourl" action="userinfo.action">
                     <s:param name="cardnumber" value="#session.user.sid"/>
                  </s:url>
			      <div class="list-group">
			           <a href="#" class="list-group-item list-group-item-danger"></a>
			           <a href="#" class="list-group-item list-group-item-danger"></a>
			           <a href="#" class="list-group-item list-group-item-danger"></a>
					   <a href="#" class="list-group-item list-group-item-danger"></a>
					</div>
			  </div>
			  <div class="tab-pane" id="settings">
			      <div class="list-group">
					  <a href="#" class="list-group-item list-group-item-warning">Porta ac consectetur ac</a>
					  <a href="#" class="list-group-item list-group-item-warning">Porta ac consectetur ac</a>
					  <a href="#" class="list-group-item list-group-item-warning">Porta ac consectetur ac</a>
					  <a href="#" class="list-group-item list-group-item-warning">Porta ac consectetur ac</a>
					</div>
			  </div>
			</div>
        </div>
        

        <div class="col-md-8">

            
            <s:if test="flag=='userinfo'">
               <ol class="breadcrumb">
                  <li><a href="">个人信息</a></li>
                  <li><a href=""><s:property value='user.sid'/>同学</a></li>
                  <li></li>
               </ol>
               <div class="panel panel-default">

					 <div class="panel-heading"></div>
					
					 <div class="panel-body">请查看您的信息是否正确</div>
					 
	                 <table class="table">
	                    <tr>
	                        <td class="text-success">姓名</td>
	                        <td class="text-success"><s:property value='user.name'/></td>
	                    </tr>
	                    <tr>
	                        <td class="text-success">性别</td>
	                        <td class="text-success"><s:property value='user.sex'/></td>
	                    </tr>
	                    <tr>
	                        <td class="text-success">学号</td>
	                        <td class="text-success"><s:property value='user.sid'/></td>
	                    </tr>
	                    <tr>
	                        <td class="text-success">寝室</td>
	                        <td class="text-success"><s:property value='user.dorm'/></td>
	                    </tr>
	                    <tr>
	                        <td class="text-success">床铺号</td>
	                        <td class="text-success"><s:property value='user.bedid'/></td>
	                    </tr>
	                    <tr>
	                        <td class="text-success">班级</td>
	                        <td class="text-success"><s:property value='user.cid'/></td>
	                    </tr>
	                    <tr>
	                        <td class="text-success">生日</td>
	                        <td class="text-success"><s:property value='user.birth'/></td>
	                    </tr>
	                 </table>
               </div>
            </s:if>
            
            

       </div>

   </div>
</div>




<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="./jquery/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="./bootstrap/bootstrap.min.js"></script>
</body>
</html>

