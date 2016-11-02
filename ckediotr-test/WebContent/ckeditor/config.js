/*
Copyright (c) 2003-2013, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
*/

CKEDITOR.editorConfig = function( config )
{
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';

	//上传文件时浏览服务文件夹                                                                                                     
	config.filebrowserBrowseUrl ='/web/ckfinder/ckfinder.html';                                                         
	// 上传图片时浏览服务文件夹                                                                                                      
	config.filebrowserImageBrowseUrl ='/web/ckfinder/ckfinder.html?Type=Images';                                        
	// 上传Flash时浏览服务文件夹                                                                                                   
	config.filebrowserFlashBrowseUrl ='/web/ckfinder/ckfinder.html?Type=Flash';                                         
	// 上传文件按钮(标签)                                                                                                       
	config.filebrowserUploadUrl ='/web/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Files';     
	// 上传图片按钮(标签)                                                                                                       
	config.filebrowserImageUploadUrl ='/web/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images';
	// 上传Flash按钮(标签)                                                                                                    
	config.filebrowserFlashUploadUrl ='/web/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash';
};

