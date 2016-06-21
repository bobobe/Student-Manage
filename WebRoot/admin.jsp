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
                        <li><a href="#">test</a></li>
                        <li><a href="#">test</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
                <li><a href="#" class="dropdown-toggle" role="button" aria-expanded="false">欢迎您,<s:property value="#session.admin"/></a></li>
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

        <div class="col-md-6">
		     <ul class="nav nav-tabs">
		      <li><a href="#shoolroll" data-toggle="tab">学籍管理</a></li>
		      <li><a href="#book" data-toggle="tab">图书管理</a></li>
		      <li><a href="#class" data-toggle="tab">班级管理</a></li>
		      <li><a href="#dorm" data-toggle="tab">宿舍管理</a></li>
		      <li><a href="#economic" data-toggle="tab">财务管理</a></li>
		     </ul>
		     
		     
		     <div class="tab-content" >
			  <div class="tab-pane active" id="shoolroll">
			      <div class="list-group">
					  <a href="showallstudent.action" class="list-group-item list-group-item-success">显示所有学生信息</a>
					  <a href="searchstudent.action" class="list-group-item list-group-item-success">精确查找</a>
					  <a href="./addstudent.jsp" class="list-group-item list-group-item-success">添加学生</a>
					  <a href="#" class="list-group-item list-group-item-success"></a>
					  <a href="#" class="list-group-item list-group-item-success"></a>
					  <a href="#" class="list-group-item list-group-item-success"></a>
				
				  </div>
			  </div>
			  <div class="tab-pane" id="book">
			      <div class="list-group">
			          <a href="showallbook.action" class="list-group-item list-group-item-info">显示图书借阅信息</a>
			          <a href="#" class="list-group-item list-group-item-info"></a>
					  <a href="#" class="list-group-item list-group-item-info"></a>
					  <a href="#" class="list-group-item list-group-item-info"></a>
					  <a href="#" class="list-group-item list-group-item-info"></a>
					  <a href="#" class="list-group-item list-group-item-info"></a>
					 
					</div>
			  </div>
			  <div class="tab-pane" id="class">
			      <div class="list-group">
			           <a href="showallclass.action" class="list-group-item list-group-item-danger">显示所有班级信息</a>
			           <a href="#" class="list-group-item list-group-item-danger"></a>
			           <a href="#" class="list-group-item list-group-item-danger"></a>
					   <a href="#" class="list-group-item list-group-item-danger"></a>
					   <a href="#" class="list-group-item list-group-item-danger"></a>
					   <a href="#" class="list-group-item list-group-item-danger"></a>
					</div>
			  </div>
			  <div class="tab-pane" id="dorm">
			      <div class="list-group">
					  <a href="showalldorm.action" class="list-group-item list-group-item-warning">显示所有宿舍信息</a>
					  <a href="#" class="list-group-item list-group-item-warning"></a>
					  <a href="#" class="list-group-item list-group-item-warning"></a>
					  <a href="#" class="list-group-item list-group-item-warning"></a>
					  <a href="#" class="list-group-item list-group-item-warning"></a>
					  <a href="#" class="list-group-item list-group-item-warning"></a>
					</div>
			  </div>
			  <div class="tab-pane" id="economic">
			      <div class="list-group">
					  <a href="showallfee.action" class="list-group-item list-group-item-success">显示学生费用记录</a>
					  <a href="#" class="list-group-item list-group-item-success"></a>
					  <a href="#" class="list-group-item list-group-item-success"></a>
					  <a href="#" class="list-group-item list-group-item-success"></a>
					</div>
			  </div>
			</div>
        </div>
               
        

       <div class="col-md-6">
              <ol class="breadcrumb">
                  <li><a href="">显示面板</a></li>
                  <li><a href=""></a></li>
                  <li></li>
              </ol>
              <div class="panel panel-default">

					 <div class="panel-heading"></div>
					
					 <div class="panel-body">
						<s:if test="flag=='showallstudent'">
								 
				                 <table class="table table-hover">
				                    <tr>
				                        <td class="text-success">姓名</td>
				                        <td class="text-success">班级</td>
				                        <td class="text-success">学号</td>
				                    </tr>
				                    
				                   <s:iterator value="userlist" id="user">
				                    <s:url var="delstudent" action="delstudent.action">
                                      <s:param name="id" value="#user.id"/>
                                    </s:url>
                                    <s:url var="showuserinfo" action="userinfo.action">
                                      <s:param name="cardnumber" value="#user.sid"/>
                                    </s:url>
								    <tr class="active">
								      <td class="text-success"><s:property value="#user.name"/></td>
									  <td class="text-success"><s:property value="#user.cid"/></td>
									  <td class="text-success"><s:property value="#user.sid"/></td>
									  <td class="text-success"><s:a href="%{showuserinfo}">点击查看详细</s:a></td>
								      <td class="text-success"><s:a href="%{delstudent}">删除</s:a></td>
								    </tr>
								   </s:iterator>
								   
				                 </table>
			              </s:if>
			              <s:if test="flag=='searchstudentform'">
			               <form class="form-inline" action="searchstudent.action?type=1" method = "post">
							  <div class="form-group">
							    <label class="sr-only" for="exampleInputAmount"></label>
							    <div class="input-group">
							      <div class="input-group-addon">按姓名查询</div>
							      <input type="text" class="form-control" name = "value" placeholder="name">
							      <div class="input-group-addon"></div>
							    </div>
							  </div>
							  <button type="submit" class="btn btn-primary">search</button>
						   </form>
						   </br>
						   </br>
						   <form class="form-inline"  action="searchstudent.action?type=0" method = "post">
							  <div class="form-group">
							    <label class="sr-only" for="exampleInputAmount"></label>
							    <div class="input-group">
							      <div class="input-group-addon">按学号查询</div>
							      <input type="text" class="form-control" name = "value" placeholder="student id">
							      <div class="input-group-addon"></div>
							    </div>
							  </div>
							  <button type="submit" class="btn btn-primary">search</button>
						   </form>
			              </s:if>
			              <s:if test="flag=='showallbook'">
								 
				                 <table class="table table-hover">
				                    <tr>
				                        <td class="text-success">书名</td>
				                        <td class="text-success">借阅日期</td>
				                        <td class="text-success">应归还日期</td>
				                        <td class="text-success">借阅人(学号)</td>
				                    </tr>
				                    
				                   <s:iterator value="booklist" id="book">
								    <tr class="active">
								      <td class="text-success"><s:property value="#book.bookname"/></td>
									  <td class="text-success"><s:property value="#book.addDate"/></td>
									  <td class="text-success"><s:property value="#book.returnDate"/></td>
									  <td class="text-success"><s:property value="#book.sid"/></td>
								    </tr>
								   </s:iterator>
								   
				                 </table>
			              </s:if>
			              <s:if test="flag=='showallclass'">
								 
				                 <table class="table table-hover">
				                    <tr>
				                        <td class="text-success">班级</td>
				                        <td class="text-success">所属学院</td>
				                        
				                    </tr>
				                    
				                   <s:iterator value="classlist" id="class">
								    <tr class="active">
								      <td class="text-success"><s:property value="#class.cid"/></td>
									  <td class="text-success"><s:property value="#class.college"/></td>
									  <s:url var="showclassinfo" action="showclassinfo.action">
                                      <s:param name="cid" value="#class.cid"/>
                                      </s:url>
								      <td class="text-success"><s:a href="%{showclassinfo}">查看班级信息</s:a></td>
								    </tr>
								   </s:iterator>
								   
				                 </table>
			              </s:if>
			              <s:if test="flag=='showalldorm'">
								 
				                 <table class="table table-hover">
				                    <tr>
				                        <td class="text-success">宿舍</td>
				                        <td class="text-success">人数</td>
				                        <td class="text-success">是否报修</td>
				                        <td class="text-success">得分</td>
				                    </tr>
				                    
				                   <s:iterator value="dormlist" id="dorm">
								    <tr class="active">
								      <td class="text-success"><s:property value="#dorm.name"/></td>
									  <td class="text-success"><s:property value="#dorm.pnum"/></td>
									  <td class="text-success"><s:property value="#dorm.isFix"/></td>
									  <td class="text-success"><s:property value="#dorm.score"/></td>
									  <s:url var="showdorminfo" action="showdorminfo.action">
                                        <s:param name="dormname" value="#dorm.name"/>
                                      </s:url>
								      <td class="text-success"><s:a href="%{showdorminfo}">查看宿舍信息</s:a></td>
								    </tr>
								   </s:iterator>
								   
				                 </table>
			              </s:if>
			              <s:if test="flag=='showallfee'">
								 
				                 <table class="table table-hover">
				                    <tr>
				                        <td class="text-success">学号</td>
				                        <td class="text-success">学费</td>
				                        <td class="text-success">班费</td>
				                        <td class="text-success">宿舍费用</td>
				                        <td class="text-success">是否已上交学费</td>
				                    </tr>
				                    
				                   <s:iterator value="feelist" id="fee">
								    <tr class="active">
								      <td class="text-success"><s:property value="#fee.sid"/></td>
									  <td class="text-success"><s:property value="#fee.schoolFee"/></td>
									  <td class="text-success"><s:property value="#fee.classFee"/></td>
									  <td class="text-success"><s:property value="#fee.dormFee"/></td>
									  <td class="text-success"><s:property value="#fee.isHand"/></td>
									  
									  <s:url var="editfeestatus" action="userinfo.action">
                                      <s:param name="cardnumber" value="#fee.sid"/>
                                      </s:url>
								      <td class="text-success"><s:a href="%{editfeestatus}">查看</s:a></td>
								    </tr>
								   </s:iterator>
								   
				                 </table>
			              </s:if>
					 </div>
			  </div>
              
          
       </div>
       

   </div>
</div>




<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="./jquery/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="./bootstrap/bootstrap.min.js"></script>
</body>
</html>

