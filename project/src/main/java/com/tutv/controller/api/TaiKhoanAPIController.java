/**
 * @package com.tutv.controller.api
 * @date Dec 17, 2021
 * @author trinh
 */
package com.tutv.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tutv.dto.KhoaDto;
import com.tutv.dto.TaiKhoanDto;
import com.tutv.entity.TaiKhoan;
import com.tutv.response.EntityResponse;
import com.tutv.response.TaiKhoanResponse;
import com.tutv.service.SendMailAPI;
import com.tutv.service.TaiKhoanService;

/**
 * TaiKhoanAPIController
 */
@Controller
@ResponseBody
public class TaiKhoanAPIController {

	@Autowired
	private TaiKhoanService tkService;
	@Autowired
	SendMailAPI mailAPI;

	@RequestMapping(value = "dangkysubmit", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String create(@RequestBody TaiKhoanDto taiKhoanDto) throws Exception {
		TaiKhoanResponse khoan = tkService.getTaiKhoan(taiKhoanDto.getEmail());
		if (khoan != null && khoan.getEnabled() == false) {
			return "{\"kq\":\"chuaxacthuc\"}";
		} else if (khoan != null) {
			return "{\"kq\":\"tontai\"}";
		} else {
			tkService.saveTaiKhoan(taiKhoanDto);
			//String toAddr = "tvtu165@gmail.com";
			String toAddr = taiKhoanDto.getEmail();
			// email subject
			String subject = "Xác nhận và kích hoạt tài khoản";
			// email body
			// String body = "There you go.. You got an email.. Let's understand
			// details on how Spring MVC works -- By Crunchify Admin";
			String body = "<!doctype html>" + "<html>" + "  <head>"
			    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
			    + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"
			    + "    <title>Simple Transactional Email</title>" + "    <style>"
			    + "@media only screen and (max-width: 620px) {" + "  table.body h1 {" + "    font-size: 28px !important;"
			    + "    margin-bottom: 10px !important;" + "  }" + "" + "  table.body p," + "table.body ul," + "table.body ol,"
			    + "table.body td," + "table.body span," + "table.body a {" + "    font-size: 16px !important;" + "  }" + ""
			    + "  table.body .wrapper," + "table.body .article {" + "    padding: 10px !important;" + "  }" + ""
			    + "  table.body .content {" + "    padding: 0 !important;" + "  }" + "" + "  table.body .container {"
			    + "    padding: 0 !important;" + "    width: 100% !important;" + "  }" + "" + "  table.body .main {"
			    + "    border-left-width: 0 !important;" + "    border-radius: 0 !important;"
			    + "    border-right-width: 0 !important;" + "  }" + "" + "  table.body .btn table {"
			    + "    width: 100% !important;" + "  }" + "" + "  table.body .btn a {" + "    width: 100% !important;" + "  }"
			    + "" + "  table.body .img-responsive {" + "    height: auto !important;" + "    max-width: 100% !important;"
			    + "    width: auto !important;" + "  }" + "}" + "@media all {" + "  .ExternalClass {" + "    width: 100%;"
			    + "  }" + "" + "  .ExternalClass," + ".ExternalClass p," + ".ExternalClass span," + ".ExternalClass font,"
			    + ".ExternalClass td," + ".ExternalClass div {" + "    line-height: 100%;" + "  }" + "" + "  .apple-link a {"
			    + "    color: inherit !important;" + "    font-family: inherit !important;"
			    + "    font-size: inherit !important;" + "    font-weight: inherit !important;"
			    + "    line-height: inherit !important;" + "    text-decoration: none !important;" + "  }" + ""
			    + "  #MessageViewBody a {" + "    color: inherit;" + "    text-decoration: none;" + "    font-size: inherit;"
			    + "    font-family: inherit;" + "    font-weight: inherit;" + "    line-height: inherit;" + "  }" + ""
			    + "  .btn-primary table td:hover {" + "    background-color: #34495e !important;" + "  }" + ""
			    + "  .btn-primary a:hover {" + "    background-color: #34495e !important;"
			    + "    border-color: #34495e !important;" + "  }" + "}" + "</style>" + "  </head>"
			    + "  <body class=\"\" style=\"background-color: #f6f6f6; font-family: sans-serif; -webkit-font-smoothing: antialiased; font-size: 14px; line-height: 1.4; margin: 0; padding: 0; -ms-text-size-adjust: 100%; -webkit-text-size-adjust: 100%;\">"
			    + "    <span class=\"preheader\" style=\"color: transparent; display: none; height: 0; max-height: 0; max-width: 0; opacity: 0; overflow: hidden; mso-hide: all; visibility: hidden; width: 0;\">This is preheader text. Some clients will show this text as a preview.</span>"
			    + "    <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"body\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f6f6f6; width: 100%;\" width=\"100%\" bgcolor=\"#f6f6f6\">"
			    + "      <tr>"
			    + "        <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\" valign=\"top\">&nbsp;</td>"
			    + "        <td class=\"container\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; display: block; max-width: 580px; padding: 10px; width: 580px; margin: 0 auto;\" width=\"580\" valign=\"top\">"
			    + "          <div class=\"content\" style=\"box-sizing: border-box; display: block; margin: 0 auto; max-width: 580px; padding: 10px;\">"
			    + "" + "            <!-- START CENTERED WHITE CONTAINER -->"
			    + "            <table role=\"presentation\" class=\"main\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; background: #ffffff; border-radius: 3px; width: 100%;\" width=\"100%\">"
			    + "" + "              <!-- START MAIN CONTENT AREA -->" + "              <tr>"
			    + "                <td class=\"wrapper\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; box-sizing: border-box; padding: 20px;\" valign=\"top\">"
			    + "                  <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: 100%;\" width=\"100%\">"
			    + "                    <tr>"
			    + "                      <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\" valign=\"top\">"
			    + "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">Chúc mừng bạn đã đăng ký thành công tài khoản.</p>"
			    + "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">Hãy bấm vào nút bên dưới để xác thực tài khoản đăng nhập vào hệ thống</p>"
			    + "                        <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"btn btn-primary\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; box-sizing: border-box; width: 100%;\" width=\"100%\">"
			    + "                          <tbody>" + "                            <tr>"
			    + "                              <td align=\"left\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; padding-bottom: 15px;\" valign=\"top\">"
			    + "                                <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: auto;\">"
			    + "                                  <tbody>" + "                                    <tr>"
			    + "                                      <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; border-radius: 5px; text-align: center; background-color: #3498db;\" valign=\"top\" align=\"center\" bgcolor=\"#3498db\"> "
			    + "<a href=\"http://localhost:8080/xacthuc?email=" + taiKhoanDto.getEmail()
			    + "\" target=\"_blank\" style=\"border: solid 1px #3498db; border-radius: 5px; box-sizing: border-box; cursor: pointer; display: inline-block; font-size: 14px; font-weight: bold; margin: 0; padding: 12px 25px; text-decoration: none; text-transform: capitalize; background-color: #3498db; border-color: #3498db; color: #ffffff;\">Xác Thực Tài Khoản</a> </td>"
			    + "                                    </tr>" + "                                  </tbody>"
			    + "                                </table>" + "                              </td>"
			    + "                            </tr>" + "                          </tbody>"
			    + "                        </table>"
			    + "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">"
			    + "                            ----------------------------------------------------"
			    + "                            <br>" + "                            TRƯỜNG ĐẠI HỌC THUỶ LỢI<br>"
			    + "                            PHÒNG CHÍNH TRỊ VÀ CÔNG TÁC SINH VIÊN.</p>"
			    + "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">"
			    + "                            Email: P7@tlu.edu.vn ; p7@wru.vn <br>"
			    + "                            ĐT:  024-35640199; 024-35639577; 024-35639117<br>"
			    + "                            024-38533084; 024-35633415<br>"
			    + "                            Fanpage hỗ trợ giải đáp thắc mắc: https://www.facebook.com/daihocthuyloi1959<br></p>"
			    + "                      </td>" + "                    </tr>" + "                  </table>"
			    + "                </td>" + "              </tr>" + "" + "            <!-- END MAIN CONTENT AREA -->"
			    + "            </table>" + "            <!-- END CENTERED WHITE CONTAINER -->" + "          </div>"
			    + "        </td>"
			    + "        <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\" valign=\"top\">&nbsp;</td>"
			    + "      </tr>" + "    </table>" + "  </body>" + "</html>" + "";
			SendMailAPI.sendMailTU(toAddr, subject, body);
			return "{\"kq\":\"ok\"}";
		}

	}

	@RequestMapping("/xacthuc")
	public String userInfo(Model model, @RequestParam(value = "email", defaultValue = "Guest") String email)
	    throws Exception {
		model.addAttribute("email", email);
		if (tkService.updateTaiKhoan(email)) {
			return "Ban da xac thuc thanh cong : " + email
			    + ". Moi ban <a href=\"http://localhost:8080/\"> <u>dang nhap</u></a>";
		} else {
			return "error";
		}

	}

	@RequestMapping("/sendmailtest")
	public String test() throws Exception {
		String toAddr = "tvtu165@gmail.com";
		// email subject
		String subject = "Hey.. This email sent by Crunchify's Spring MVC Tutorial";
		// email body
		// String body = "There you go.. You got an email.. Let's understand details
		// on how Spring MVC works -- By Crunchify Admin";
		String body = "<!doctype html>" + "<html>" + "  <head>"
		    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
		    + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"
		    + "    <title>Simple Transactional Email</title>" + "    <style>"
		    + "@media only screen and (max-width: 620px) {" + "  table.body h1 {" + "    font-size: 28px !important;"
		    + "    margin-bottom: 10px !important;" + "  }" + "" + "  table.body p," + "table.body ul," + "table.body ol,"
		    + "table.body td," + "table.body span," + "table.body a {" + "    font-size: 16px !important;" + "  }" + ""
		    + "  table.body .wrapper," + "table.body .article {" + "    padding: 10px !important;" + "  }" + ""
		    + "  table.body .content {" + "    padding: 0 !important;" + "  }" + "" + "  table.body .container {"
		    + "    padding: 0 !important;" + "    width: 100% !important;" + "  }" + "" + "  table.body .main {"
		    + "    border-left-width: 0 !important;" + "    border-radius: 0 !important;"
		    + "    border-right-width: 0 !important;" + "  }" + "" + "  table.body .btn table {"
		    + "    width: 100% !important;" + "  }" + "" + "  table.body .btn a {" + "    width: 100% !important;" + "  }"
		    + "" + "  table.body .img-responsive {" + "    height: auto !important;" + "    max-width: 100% !important;"
		    + "    width: auto !important;" + "  }" + "}" + "@media all {" + "  .ExternalClass {" + "    width: 100%;"
		    + "  }" + "" + "  .ExternalClass," + ".ExternalClass p," + ".ExternalClass span," + ".ExternalClass font,"
		    + ".ExternalClass td," + ".ExternalClass div {" + "    line-height: 100%;" + "  }" + "" + "  .apple-link a {"
		    + "    color: inherit !important;" + "    font-family: inherit !important;"
		    + "    font-size: inherit !important;" + "    font-weight: inherit !important;"
		    + "    line-height: inherit !important;" + "    text-decoration: none !important;" + "  }" + ""
		    + "  #MessageViewBody a {" + "    color: inherit;" + "    text-decoration: none;" + "    font-size: inherit;"
		    + "    font-family: inherit;" + "    font-weight: inherit;" + "    line-height: inherit;" + "  }" + ""
		    + "  .btn-primary table td:hover {" + "    background-color: #34495e !important;" + "  }" + ""
		    + "  .btn-primary a:hover {" + "    background-color: #34495e !important;"
		    + "    border-color: #34495e !important;" + "  }" + "}" + "</style>" + "  </head>"
		    + "  <body class=\"\" style=\"background-color: #f6f6f6; font-family: sans-serif; -webkit-font-smoothing: antialiased; font-size: 14px; line-height: 1.4; margin: 0; padding: 0; -ms-text-size-adjust: 100%; -webkit-text-size-adjust: 100%;\">"
		    + "    <span class=\"preheader\" style=\"color: transparent; display: none; height: 0; max-height: 0; max-width: 0; opacity: 0; overflow: hidden; mso-hide: all; visibility: hidden; width: 0;\">This is preheader text. Some clients will show this text as a preview.</span>"
		    + "    <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"body\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f6f6f6; width: 100%;\" width=\"100%\" bgcolor=\"#f6f6f6\">"
		    + "      <tr>"
		    + "        <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\" valign=\"top\">&nbsp;</td>"
		    + "        <td class=\"container\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; display: block; max-width: 580px; padding: 10px; width: 580px; margin: 0 auto;\" width=\"580\" valign=\"top\">"
		    + "          <div class=\"content\" style=\"box-sizing: border-box; display: block; margin: 0 auto; max-width: 580px; padding: 10px;\">"
		    + "" + "            <!-- START CENTERED WHITE CONTAINER -->"
		    + "            <table role=\"presentation\" class=\"main\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; background: #ffffff; border-radius: 3px; width: 100%;\" width=\"100%\">"
		    + "" + "              <!-- START MAIN CONTENT AREA -->" + "              <tr>"
		    + "                <td class=\"wrapper\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; box-sizing: border-box; padding: 20px;\" valign=\"top\">"
		    + "                  <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: 100%;\" width=\"100%\">"
		    + "                    <tr>"
		    + "                      <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\" valign=\"top\">"
		    + "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">Chúc mừng bạn đã đăng ký thành công tài khoản.</p>"
		    + "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">Hãy bấm vào nút bên dưới để xác thực tài khoản đăng nhập vào hệ thống</p>"
		    + "                        <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"btn btn-primary\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; box-sizing: border-box; width: 100%;\" width=\"100%\">"
		    + "                          <tbody>" + "                            <tr>"
		    + "                              <td align=\"left\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; padding-bottom: 15px;\" valign=\"top\">"
		    + "                                <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: auto;\">"
		    + "                                  <tbody>" + "                                    <tr>"
		    + "                                      <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; border-radius: 5px; text-align: center; background-color: #3498db;\" valign=\"top\" align=\"center\" bgcolor=\"#3498db\"> <a href=\"http://localhost:8080/xacthuc?email=tvtu165@gmail.com\" target=\"_blank\" style=\"border: solid 1px #3498db; border-radius: 5px; box-sizing: border-box; cursor: pointer; display: inline-block; font-size: 14px; font-weight: bold; margin: 0; padding: 12px 25px; text-decoration: none; text-transform: capitalize; background-color: #3498db; border-color: #3498db; color: #ffffff;\">Xác Thực Tài Khoản</a> </td>"
		    + "                                    </tr>" + "                                  </tbody>"
		    + "                                </table>" + "                              </td>"
		    + "                            </tr>" + "                          </tbody>"
		    + "                        </table>"
		    + "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">"
		    + "                            ----------------------------------------------------"
		    + "                            <br>" + "                            TRƯỜNG ĐẠI HỌC THUỶ LỢI<br>"
		    + "                            PHÒNG CHÍNH TRỊ VÀ CÔNG TÁC SINH VIÊN.</p>"
		    + "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">"
		    + "                            Email: P7@tlu.edu.vn ; p7@wru.vn <br>"
		    + "                            ĐT:  024-35640199; 024-35639577; 024-35639117<br>"
		    + "                            024-38533084; 024-35633415<br>"
		    + "                            Fanpage hỗ trợ giải đáp thắc mắc: https://www.facebook.com/daihocthuyloi1959<br></p>"
		    + "                      </td>" + "                    </tr>" + "                  </table>"
		    + "                </td>" + "              </tr>" + "" + "            <!-- END MAIN CONTENT AREA -->"
		    + "            </table>" + "            <!-- END CENTERED WHITE CONTAINER -->" + "          </div>"
		    + "        </td>"
		    + "        <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\" valign=\"top\">&nbsp;</td>"
		    + "      </tr>" + "    </table>" + "  </body>" + "</html>" + "";
		SendMailAPI.sendMailTU(toAddr, subject, body);
		return "oka";

	}

	
	@RequestMapping(value = "taikhoan", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String showHoSo(@RequestBody KhoaDto taikhoanDto) throws Exception {
		TaiKhoanResponse taikhoan = tkService.getTaiKhoan(taikhoanDto.getId());
		return taikhoan.toJson();
	}
	
	@RequestMapping(value = "taikhoans", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String listTaiKhoan() throws Exception {
		List<TaiKhoanResponse> taikhoan = tkService.getListTaiKhoan();
		return EntityResponse.toJson(taikhoan);
	}
	
	@RequestMapping(value = "taikhoan", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String createTaiKhoan(@RequestBody TaiKhoanDto taikhoanDto) throws Exception {
		
		TaiKhoan kq = tkService.createTaiKhoan(taikhoanDto);
		if (kq != null ) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
	@RequestMapping(value = "taikhoan", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String updateHoSo(@RequestBody TaiKhoanDto taikhoanDto) throws Exception {
		
		TaiKhoan kq = tkService.updateTaiKhoan2(taikhoanDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
	@RequestMapping(value = "taikhoan", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String deleteHoSo(@RequestBody TaiKhoanDto taikhoanDto) throws Exception {
		TaiKhoan taikhoan = tkService.deleteTaiKhoan(taikhoanDto.getId());
		if (taikhoan != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
}
