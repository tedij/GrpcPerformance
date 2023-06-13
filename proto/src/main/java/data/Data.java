package data;

import java.util.Arrays;
import java.util.List;

public class Data {

    public static List<TemplateResponse> getTemplates() {
        return Arrays.asList(getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(),
                getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(),
                getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate(), getTemplate());
    }

//    TemplateRequest
    public static TemplateResponse getTemplate() {
        return TemplateResponse.newBuilder()
                .setId(1)
                .setTemplateName("signup")
                .setContent("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                        "<html style=\"width:100%;font-family:'Lato', sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\n" +
                        " <head>\n" +
                        "  <meta charset=\"UTF-8\">\n" +
                        "  <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\">\n" +
                        "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
                        "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "  <meta content=\"telephone=no\" name=\"format-detection\">\n" +
                        "  <title>Konfirmasi Email Pendaftaran Ajaib</title>\n" +
                        "  <!--[if (mso 16)]>    <style type=\"text/css\">    a {text-decoration: none;}    </style>    <![endif]-->\n" +
                        "  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]-->\n" +
                        "  <!--[if !mso]> -->\n" +
                        "  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\">\n" +
                        "  <!--<![endif]-->\n" +
                        "  <style type=\"text/css\">\n" +
                        "                @media screen and (prefers-color-scheme: light) {\n" +
                        "            body {\n" +
                        "                background-color: white;\n" +
                        "                color: black;\n" +
                        "            }\n" +
                        "        }\n" +
                        "        @media only screen and (max-width:600px) {\n" +
                        "    .mobile-flex-center { margin:auto; max-width:200px }\n" +
                        "    .removed-pads { margin-bottom:-20px!important }\n" +
                        "            td.mobile-bg-small { background-size:50% }\n" +
                        "    .header-mobile-small { max-width:150px }\n" +
                        "            p, ul li, ol li, a { font-size:14px!important; line-height:150%!important }\n" +
                        "            h1 { font-size:30px!important; text-align:center; line-height:120%!important }\n" +
                        "            h2 { font-size:20px!important; text-align:center; line-height:120%!important }\n" +
                        "            h3 { font-size:16px!important; text-align:center; line-height:120%!important }\n" +
                        "            h1 a { font-size:30px!important }\n" +
                        "            h2 a { font-size:22px!important }\n" +
                        "            h3 a { font-size:18px!important }\n" +
                        "    .es-menu td a { font-size:14px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:14px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:14px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } a.es-button { font-size:15px!important; display:block!important; border-width:10px 0px 10px 0px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important }\n" +
                        "    /* .footer-desktop {\n" +
                        "      display: none !important;\n" +
                        "    }\n" +
                        "    .footer-mobile {\n" +
                        "      display: table-row !important;\n" +
                        "\n" +
                        "    } */\n" +
                        "        }\n" +
                        "/* .footer-desktop {\n" +
                        "  display: table-row;\n" +
                        "  background-size: 331px 147px;\n" +
                        "}\n" +
                        ".footer-mobile {\n" +
                        "  display: none;\n" +
                        "} */\n" +
                        "#outlook a {\n" +
                        "            padding:0;\n" +
                        "        }\n" +
                        ".ExternalClass {\n" +
                        "            width:100%;\n" +
                        "        }\n" +
                        ".ExternalClass,\n" +
                        ".ExternalClass p,\n" +
                        ".ExternalClass span,\n" +
                        ".ExternalClass font,\n" +
                        ".ExternalClass td,\n" +
                        ".ExternalClass div {\n" +
                        "            line-height:100%;\n" +
                        "        }\n" +
                        ".es-button {\n" +
                        "            mso-style-priority:100!important;\n" +
                        "            text-decoration:none!important;\n" +
                        "        }\n" +
                        "        a[x-apple-data-detectors] {\n" +
                        "            color:inherit!important;\n" +
                        "            text-decoration:none!important;\n" +
                        "            font-size:inherit!important;\n" +
                        "            font-family:inherit!important;\n" +
                        "            font-weight:inherit!important;\n" +
                        "            line-height:inherit!important;\n" +
                        "        }\n" +
                        ".es-desk-hidden {\n" +
                        "            display:none;\n" +
                        "            float:left;\n" +
                        "            overflow:hidden;\n" +
                        "            width:0;\n" +
                        "            max-height:0;\n" +
                        "            line-height:0;\n" +
                        "            mso-hide:all;\n" +
                        "        }\n" +
                        "</style>\n" +
                        "<script>\n" +
                        "                function getColSpan() {\n" +
                        "            if(screen.width < 600) {\n" +
                        "                document.getElementById('socialMedia').colSpan = \"1\";\n" +
                        "            }\n" +
                        "        }\n" +
                        "</script>\n" +
                        " </head>\n" +
                        " <body onload=\"getColSpan()\" style=\"width:100%;font-family: 'Lato', sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\n" +
                        "  <div class=\"es-wrapper-color\" style=\"background-color:#F6F6F6; min-height: 100vh;\">\n" +
                        "   <!--[if gte mso 9]><v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\"><v:fill type=\"tile\" color=\"#f6f6f6\"></v:fill></v:background><![endif]-->\n" +
                        "   <table class=\"es-wrapper\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;\">\n" +
                        "     <tr style=\"border-collapse:collapse;\">\n" +
                        "      <td valign=\"top\" style=\"padding:0;Margin:0;\">\n" +
                        "\n" +
                        "       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\">\n" +
                        "         <tr style=\"border-collapse:collapse;\">\n" +
                        "          <td class=\"es-adaptive\" align=\"center\" style=\"padding:0;Margin:0;\">\n" +
                        "           <table class=\"es-content-body\" cellspacing=\"0\" cellpadding=\"0\" width=\"600\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\">\n" +
                        "             <tr style=\"border-collapse:collapse;\">\n" +
                        "              <td class=\"mobile-bg-small\" align=\"left\" bgcolor=\"transparent\" style=\"margin:0;text-align:justify;padding-top:20px;padding-bottom:20px;padding-left:20px;padding-right:20px;background-image:url(https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-top-right-vector.png);background-size: 243px 186px;background-color:transparent;background-position:right top;background-repeat:no-repeat;\" background=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-top-right-vector.png\">\n" +
                        "               <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\">\n" +
                        "                 <tr style=\"border-collapse:collapse;\">\n" +
                        "                  <td width=\"560\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\">\n" +
                        "                   <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\">\n" +
                        "                     <tr style=\"border-collapse:collapse;\">\n" +
                        "                      <td align=\"left\" class=\"es-m-txt-l\" style=\"padding:0;Margin:0;\"> <a target=\"_blank\" href=\"https://ajaib.co.id\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:'Lato', sans-serif;font-size:14px;text-decoration:underline;color:#1376C8;\"> <img src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/logo-2020-blue.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" height=\"35\"> </a> </td>\n" +
                        "                     </tr>\n" +
                        "                     <tr style=\"border-collapse:collapse;\">\n" +
                        "                      <td align=\"center\" style=\"padding:0;Margin:0;\">\n" +
                        "                          <a href=\"#\">\n" +
                        "                          <img class=\"adapt-img header-mobile-small\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-content-image.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" height=\"200\">\n" +
                        "                          </a>\n" +
                        "                      </td>\n" +
                        "                     </tr>\n" +
                        "                   </table> </td>\n" +
                        "                 </tr>\n" +
                        "               </table></td>\n" +
                        "             </tr>\n" +
                        "           </table> </td>\n" +
                        "         </tr>\n" +
                        "       </table>\n" +
                        "\n" +
                        "        <!--welcome-->\n" +
                        "        <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\">\n" +
                        "        <tr style=\"border-collapse:collapse;\">\n" +
                        "        <td align=\"center\" style=\"padding:0;Margin:0;\">\n" +
                        "        <table class=\"es-content-body\" cellspacing=\"0\" cellpadding=\"0\" width=\"600\" bgcolor=\"#ffffff\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\">\n" +
                        "          <tr style=\"border-collapse:collapse;\">\n" +
                        "           <td align=\"left\" style=\"margin:0;text-align:justify;padding-left:15px;padding-right:15px;padding-top:20px;padding-bottom:20px;background-position:right top;\">\n" +
                        "            <table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\">\n" +
                        "              <tr style=\"border-collapse:collapse;\">\n" +
                        "               <td width=\"570\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\">\n" +
                        "                <table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\">\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                   <td class=\"es-m-txt-l\" align=\"center\" style=\"padding:0;Margin:0;\"> <h2 style=\"margin:0;text-align:center !important;line-height:26px;mso-line-height-rule:exactly;font-family:'Lato', sans-serif;font-size:22px;font-style:normal;font-weight:normal;color:#333333;\"><strong>Hai, calon investor!</strong></h2> </td>\n" +
                        "                  </tr>\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                    <td align=\"center\" style=\"padding:0;Margin:0;padding-top:24px;\">\n" +
                        "                       <p style=\"margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">\n" +
                        "                Demi keamanan, kami perlu memastikan bahwa email ini milikmu.\n" +
                        "                        </p>\n" +
                        "                    </td>\n" +
                        "                  </tr>\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                    <td align=\"center\" style=\"padding:0;Margin:0;padding-top:24px;\">\n" +
                        "                      <div style=\"cursor: pointer; background-color: #3A83F9; color: #FFFFFF; font-size: 13px; border-radius: 4px; margin-bottom: 24px; margin: 0 auto; max-width: 400px;\" align=\"center\">\n" +
                        "                        <a style=\"color: inherit; text-decoration: none;display: block;padding: 12px 0px;\" href=\"${ activate_url }?redirect=https://ajaib.onelink.me/SgM5&redirect_web=https://spa-uat.ajaib.tech\" target=\"_blank\">\n" +
                        "                          <b>Verifikasi Email</b>\n" +
                        "                        </a>\n" +
                        "                      </div>\n" +
                        "                    </td>\n" +
                        "                  </tr>\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                    <td align=\"center\" style=\"padding:0;Margin:0;padding-top:24px;\">\n" +
                        "                       <p style=\"margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">\n" +
                        "                Jika kamu merasa tidak pernah mendaftar ke Ajaib, segera hubungi CS kami di <a href=\"mailto:support@ajaib.co.id\" style=\"text-decoration: none; color: #3a83f9;\">support@ajaib.co.id.</a>  untuk melakukan tindak lanjut terkait email kamu.\n" +
                        "                        </p>\n" +
                        "                    </td>\n" +
                        "                  </tr>\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                    <td align=\"center\" style=\"padding:0;Margin:0;padding-top:24px;\">\n" +
                        "                       <p style=\"margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">\n" +
                        "                Salam,\n" +
                        "                        <br>\n" +
                        "                Tim Ajaib\n" +
                        "                </p>\n" +
                        "                    </td>\n" +
                        "                  </tr>\n" +
                        "\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                   <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-top:52px;\">\n" +
                        "                    <table border=\"0\" width=\"100%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\">\n" +
                        "                      <tr style=\"border-collapse:collapse;\">\n" +
                        "                       <td style=\"padding:0;Margin:0px 0px 0px 0px;border-bottom:1px solid #CCCCCC;background:none;height:1px;width:100%;margin:0px;\"></td>\n" +
                        "                      </tr>\n" +
                        "                    </table> </td>\n" +
                        "                  </tr>\n" +
                        "                </table> </td>\n" +
                        "              </tr>\n" +
                        "            </table> </td>\n" +
                        "          </tr>\n" +
                        "        </table> </td>\n" +
                        "        </tr>\n" +
                        "        </table>\n" +
                        "        <!--welcome ends-->\n" +
                        "      <!-- new 2021 footer start-->\n" +
                        "       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\">\n" +
                        "         <tr style=\"border-collapse:collapse;\">\n" +
                        "          <td align=\"center\" style=\"padding:0;Margin:0;\" >\n" +
                        "           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\" cellspacing=\"0\" cellpadding=\"0\" width=\"600\" bgcolor=\"#ffffff\" align=\"center\">\n" +
                        "\n" +
                        "\n" +
                        "            <!-- <tr class=\"footer-desktop\" style=\"border-collapse:collapse; background-image:url(https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-bottom-right-vector.png);\n" +
                        "        background-position:right bottom;background-repeat:no-repeat;\" background=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-bottom-right-vector.png\">\n" +
                        "              <td align=\"left\" style=\"margin:0;text-align:justify;padding-left:16px;padding-right:8px; float: left; padding-bottom: 48px;\" >\n" +
                        "                  <div align=\"left\">\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.facebook.com/ajaib.investasi/\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-facebook-logo.png\" alt=\"Facebook\" title=\"Facebook\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.instagram.com/ajaib_investasi/\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-instagram-logo.png\" alt=\"Instagram\" title=\"Instagram\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.youtube.com/channel/UCyQPkTAkLNk_n-NPJebmaIw\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-youtube-logo.png\" alt=\"YouTube\" title=\"YouTube\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://twitter.com/ajaib_investasi\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-twitter-logo.png\" alt=\"Twitter\" title=\"Twitter\" style=\"text-decoration:none;height:auto;border:0;display:block\" class=\"CToWUd\"></a></div>\n" +
                        "                </div>\n" +
                        "                <p style=\"padding-top: 4px;margin:0;text-align:left;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333; max-width: 330px;\">Copyright by Ajaib. Neo Soho @Podomoro City Lt. 30, Jl. Letjen S. Parman No.28, Jakarta Barat</p>\n" +
                        "                <a style=\"padding-top: 4px;margin:0;text-align:left;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#3a83f9;\" href=\"https://ajaib.co.id/email-disclaimer\">Terms of service</a>\n" +
                        "              </td>\n" +
                        "              <td align=\"right\" style=\"margin:0;text-align:justify;padding-right:16px; float: right;\">\n" +
                        "                <div align=\"center\" style=\"padding-right:0px;padding-left:0px\">\n" +
                        "                  <p style=\"margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">Terdaftar dan diawasi oleh OJK</p>\n" +
                        "                  <img align=\"center\" border=\"0\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-ojk-logo.png\"\n" +
                        "        style=\"text-decoration:none;height:auto;border:0;width:140px;max-width:100%;display:block\"\n" +
                        "        width=\"140\" class=\"CToWUd a6T\" tabindex=\"0\">\n" +
                        "                </div>\n" +
                        "              </td>\n" +
                        "             </tr> -->\n" +
                        "\n" +
                        "            <tr class=\"footer-mobile\" style=\"border-collapse:collapse;\">\n" +
                        "              <td style=\"margin:0;text-align:justify;padding-left:16px;padding-right:8px; padding-bottom: 32px;\" >\n" +
                        "                  <div style=\"text-align: center;\">\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.facebook.com/ajaib.investasi/\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-facebook-logo.png\" alt=\"Facebook\" title=\"Facebook\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.instagram.com/ajaib_investasi/\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-instagram-logo.png\" alt=\"Instagram\" title=\"Instagram\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.youtube.com/channel/UCyQPkTAkLNk_n-NPJebmaIw\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-youtube-logo.png\" alt=\"YouTube\" title=\"YouTube\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://twitter.com/ajaib_investasi\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-twitter-logo.png\" alt=\"Twitter\" title=\"Twitter\" style=\"text-decoration:none;height:auto;border:0;display:block\" class=\"CToWUd\"></a></div>\n" +
                        "                </div>\n" +
                        "                <p style=\"padding-top: 4px;margin:0px 48px;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">Copyright by Ajaib. Neo Soho @Podomoro City Lt. 30, Jl. Letjen S. Parman No.28, Jakarta Barat</p>\n" +
                        "                <a style=\"display: block; padding-top: 4px;margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#3a83f9;\" href=\"https://ajaib.co.id/email-disclaimer\" target=\"_blank\">Terms of service</a>\n" +
                        "              </td>\n" +
                        "            </tr>\n" +
                        "            <tr class=\"footer-mobile\" style=\"border-collapse:collapse; background-image:url(https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-bottom-right-vector.png);\n" +
                        "        background-position:right bottom;background-repeat:no-repeat;background-size: 179px 80px;\" background=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-bottom-right-vector.png\">\n" +
                        "\n" +
                        "              <td style=\"margin:0;text-align:justify;padding-left:32px;padding-right:16px;padding-bottom: 48px;\">\n" +
                        "                <div align=\"center\" style=\"padding-right:0px;padding-left:0px\">\n" +
                        "                  <p style=\"margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">Terdaftar dan diawasi oleh OJK</p>\n" +
                        "                  <img align=\"center\" border=\"0\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-ojk-logo.png\"\n" +
                        "        style=\"text-decoration:none;height:auto;border:0;width:140px;max-width:100%;display:block\"\n" +
                        "        width=\"140\" class=\"CToWUd a6T\" tabindex=\"0\">\n" +
                        "                </div>\n" +
                        "              </td>\n" +
                        "             </tr>\n" +
                        "\n" +
                        "           </table>\n" +
                        "          </td>\n" +
                        "         </tr>\n" +
                        "\n" +
                        "       </table>\n" +
                        "       <!-- end 2021 footer-->\n" +
                        "  </div>\n" +
                        " </body>\n" +
                        "</html>")
                .build();
    }


    public static List<TemplateModel> getTemplatesModel() {
        return Arrays.asList(getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(),
                getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(),
                getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel(), getTemplateModel());
    }

    //    TemplateRequest
    public static TemplateModel getTemplateModel() {
        return TemplateModel.builder()
                .id(1)
                .templateName("signup")
                .content("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                        "<html style=\"width:100%;font-family:'Lato', sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\n" +
                        " <head>\n" +
                        "  <meta charset=\"UTF-8\">\n" +
                        "  <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\">\n" +
                        "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
                        "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "  <meta content=\"telephone=no\" name=\"format-detection\">\n" +
                        "  <title>Konfirmasi Email Pendaftaran Ajaib</title>\n" +
                        "  <!--[if (mso 16)]>    <style type=\"text/css\">    a {text-decoration: none;}    </style>    <![endif]-->\n" +
                        "  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]-->\n" +
                        "  <!--[if !mso]> -->\n" +
                        "  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\">\n" +
                        "  <!--<![endif]-->\n" +
                        "  <style type=\"text/css\">\n" +
                        "                @media screen and (prefers-color-scheme: light) {\n" +
                        "            body {\n" +
                        "                background-color: white;\n" +
                        "                color: black;\n" +
                        "            }\n" +
                        "        }\n" +
                        "        @media only screen and (max-width:600px) {\n" +
                        "    .mobile-flex-center { margin:auto; max-width:200px }\n" +
                        "    .removed-pads { margin-bottom:-20px!important }\n" +
                        "            td.mobile-bg-small { background-size:50% }\n" +
                        "    .header-mobile-small { max-width:150px }\n" +
                        "            p, ul li, ol li, a { font-size:14px!important; line-height:150%!important }\n" +
                        "            h1 { font-size:30px!important; text-align:center; line-height:120%!important }\n" +
                        "            h2 { font-size:20px!important; text-align:center; line-height:120%!important }\n" +
                        "            h3 { font-size:16px!important; text-align:center; line-height:120%!important }\n" +
                        "            h1 a { font-size:30px!important }\n" +
                        "            h2 a { font-size:22px!important }\n" +
                        "            h3 a { font-size:18px!important }\n" +
                        "    .es-menu td a { font-size:14px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:14px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:14px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } a.es-button { font-size:15px!important; display:block!important; border-width:10px 0px 10px 0px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important }\n" +
                        "    /* .footer-desktop {\n" +
                        "      display: none !important;\n" +
                        "    }\n" +
                        "    .footer-mobile {\n" +
                        "      display: table-row !important;\n" +
                        "\n" +
                        "    } */\n" +
                        "        }\n" +
                        "/* .footer-desktop {\n" +
                        "  display: table-row;\n" +
                        "  background-size: 331px 147px;\n" +
                        "}\n" +
                        ".footer-mobile {\n" +
                        "  display: none;\n" +
                        "} */\n" +
                        "#outlook a {\n" +
                        "            padding:0;\n" +
                        "        }\n" +
                        ".ExternalClass {\n" +
                        "            width:100%;\n" +
                        "        }\n" +
                        ".ExternalClass,\n" +
                        ".ExternalClass p,\n" +
                        ".ExternalClass span,\n" +
                        ".ExternalClass font,\n" +
                        ".ExternalClass td,\n" +
                        ".ExternalClass div {\n" +
                        "            line-height:100%;\n" +
                        "        }\n" +
                        ".es-button {\n" +
                        "            mso-style-priority:100!important;\n" +
                        "            text-decoration:none!important;\n" +
                        "        }\n" +
                        "        a[x-apple-data-detectors] {\n" +
                        "            color:inherit!important;\n" +
                        "            text-decoration:none!important;\n" +
                        "            font-size:inherit!important;\n" +
                        "            font-family:inherit!important;\n" +
                        "            font-weight:inherit!important;\n" +
                        "            line-height:inherit!important;\n" +
                        "        }\n" +
                        ".es-desk-hidden {\n" +
                        "            display:none;\n" +
                        "            float:left;\n" +
                        "            overflow:hidden;\n" +
                        "            width:0;\n" +
                        "            max-height:0;\n" +
                        "            line-height:0;\n" +
                        "            mso-hide:all;\n" +
                        "        }\n" +
                        "</style>\n" +
                        "<script>\n" +
                        "                function getColSpan() {\n" +
                        "            if(screen.width < 600) {\n" +
                        "                document.getElementById('socialMedia').colSpan = \"1\";\n" +
                        "            }\n" +
                        "        }\n" +
                        "</script>\n" +
                        " </head>\n" +
                        " <body onload=\"getColSpan()\" style=\"width:100%;font-family: 'Lato', sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\n" +
                        "  <div class=\"es-wrapper-color\" style=\"background-color:#F6F6F6; min-height: 100vh;\">\n" +
                        "   <!--[if gte mso 9]><v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\"><v:fill type=\"tile\" color=\"#f6f6f6\"></v:fill></v:background><![endif]-->\n" +
                        "   <table class=\"es-wrapper\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;\">\n" +
                        "     <tr style=\"border-collapse:collapse;\">\n" +
                        "      <td valign=\"top\" style=\"padding:0;Margin:0;\">\n" +
                        "\n" +
                        "       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\">\n" +
                        "         <tr style=\"border-collapse:collapse;\">\n" +
                        "          <td class=\"es-adaptive\" align=\"center\" style=\"padding:0;Margin:0;\">\n" +
                        "           <table class=\"es-content-body\" cellspacing=\"0\" cellpadding=\"0\" width=\"600\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\">\n" +
                        "             <tr style=\"border-collapse:collapse;\">\n" +
                        "              <td class=\"mobile-bg-small\" align=\"left\" bgcolor=\"transparent\" style=\"margin:0;text-align:justify;padding-top:20px;padding-bottom:20px;padding-left:20px;padding-right:20px;background-image:url(https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-top-right-vector.png);background-size: 243px 186px;background-color:transparent;background-position:right top;background-repeat:no-repeat;\" background=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-top-right-vector.png\">\n" +
                        "               <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\">\n" +
                        "                 <tr style=\"border-collapse:collapse;\">\n" +
                        "                  <td width=\"560\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\">\n" +
                        "                   <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\">\n" +
                        "                     <tr style=\"border-collapse:collapse;\">\n" +
                        "                      <td align=\"left\" class=\"es-m-txt-l\" style=\"padding:0;Margin:0;\"> <a target=\"_blank\" href=\"https://ajaib.co.id\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:'Lato', sans-serif;font-size:14px;text-decoration:underline;color:#1376C8;\"> <img src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/logo-2020-blue.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" height=\"35\"> </a> </td>\n" +
                        "                     </tr>\n" +
                        "                     <tr style=\"border-collapse:collapse;\">\n" +
                        "                      <td align=\"center\" style=\"padding:0;Margin:0;\">\n" +
                        "                          <a href=\"#\">\n" +
                        "                          <img class=\"adapt-img header-mobile-small\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-content-image.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" height=\"200\">\n" +
                        "                          </a>\n" +
                        "                      </td>\n" +
                        "                     </tr>\n" +
                        "                   </table> </td>\n" +
                        "                 </tr>\n" +
                        "               </table></td>\n" +
                        "             </tr>\n" +
                        "           </table> </td>\n" +
                        "         </tr>\n" +
                        "       </table>\n" +
                        "\n" +
                        "        <!--welcome-->\n" +
                        "        <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\">\n" +
                        "        <tr style=\"border-collapse:collapse;\">\n" +
                        "        <td align=\"center\" style=\"padding:0;Margin:0;\">\n" +
                        "        <table class=\"es-content-body\" cellspacing=\"0\" cellpadding=\"0\" width=\"600\" bgcolor=\"#ffffff\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\">\n" +
                        "          <tr style=\"border-collapse:collapse;\">\n" +
                        "           <td align=\"left\" style=\"margin:0;text-align:justify;padding-left:15px;padding-right:15px;padding-top:20px;padding-bottom:20px;background-position:right top;\">\n" +
                        "            <table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\">\n" +
                        "              <tr style=\"border-collapse:collapse;\">\n" +
                        "               <td width=\"570\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\">\n" +
                        "                <table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\">\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                   <td class=\"es-m-txt-l\" align=\"center\" style=\"padding:0;Margin:0;\"> <h2 style=\"margin:0;text-align:center !important;line-height:26px;mso-line-height-rule:exactly;font-family:'Lato', sans-serif;font-size:22px;font-style:normal;font-weight:normal;color:#333333;\"><strong>Hai, calon investor!</strong></h2> </td>\n" +
                        "                  </tr>\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                    <td align=\"center\" style=\"padding:0;Margin:0;padding-top:24px;\">\n" +
                        "                       <p style=\"margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">\n" +
                        "                Demi keamanan, kami perlu memastikan bahwa email ini milikmu.\n" +
                        "                        </p>\n" +
                        "                    </td>\n" +
                        "                  </tr>\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                    <td align=\"center\" style=\"padding:0;Margin:0;padding-top:24px;\">\n" +
                        "                      <div style=\"cursor: pointer; background-color: #3A83F9; color: #FFFFFF; font-size: 13px; border-radius: 4px; margin-bottom: 24px; margin: 0 auto; max-width: 400px;\" align=\"center\">\n" +
                        "                        <a style=\"color: inherit; text-decoration: none;display: block;padding: 12px 0px;\" href=\"${ activate_url }?redirect=https://ajaib.onelink.me/SgM5&redirect_web=https://spa-uat.ajaib.tech\" target=\"_blank\">\n" +
                        "                          <b>Verifikasi Email</b>\n" +
                        "                        </a>\n" +
                        "                      </div>\n" +
                        "                    </td>\n" +
                        "                  </tr>\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                    <td align=\"center\" style=\"padding:0;Margin:0;padding-top:24px;\">\n" +
                        "                       <p style=\"margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">\n" +
                        "                Jika kamu merasa tidak pernah mendaftar ke Ajaib, segera hubungi CS kami di <a href=\"mailto:support@ajaib.co.id\" style=\"text-decoration: none; color: #3a83f9;\">support@ajaib.co.id.</a>  untuk melakukan tindak lanjut terkait email kamu.\n" +
                        "                        </p>\n" +
                        "                    </td>\n" +
                        "                  </tr>\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                    <td align=\"center\" style=\"padding:0;Margin:0;padding-top:24px;\">\n" +
                        "                       <p style=\"margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">\n" +
                        "                Salam,\n" +
                        "                        <br>\n" +
                        "                Tim Ajaib\n" +
                        "                </p>\n" +
                        "                    </td>\n" +
                        "                  </tr>\n" +
                        "\n" +
                        "                  <tr style=\"border-collapse:collapse;\">\n" +
                        "                   <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-top:52px;\">\n" +
                        "                    <table border=\"0\" width=\"100%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\">\n" +
                        "                      <tr style=\"border-collapse:collapse;\">\n" +
                        "                       <td style=\"padding:0;Margin:0px 0px 0px 0px;border-bottom:1px solid #CCCCCC;background:none;height:1px;width:100%;margin:0px;\"></td>\n" +
                        "                      </tr>\n" +
                        "                    </table> </td>\n" +
                        "                  </tr>\n" +
                        "                </table> </td>\n" +
                        "              </tr>\n" +
                        "            </table> </td>\n" +
                        "          </tr>\n" +
                        "        </table> </td>\n" +
                        "        </tr>\n" +
                        "        </table>\n" +
                        "        <!--welcome ends-->\n" +
                        "      <!-- new 2021 footer start-->\n" +
                        "       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\">\n" +
                        "         <tr style=\"border-collapse:collapse;\">\n" +
                        "          <td align=\"center\" style=\"padding:0;Margin:0;\" >\n" +
                        "           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\" cellspacing=\"0\" cellpadding=\"0\" width=\"600\" bgcolor=\"#ffffff\" align=\"center\">\n" +
                        "\n" +
                        "\n" +
                        "            <!-- <tr class=\"footer-desktop\" style=\"border-collapse:collapse; background-image:url(https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-bottom-right-vector.png);\n" +
                        "        background-position:right bottom;background-repeat:no-repeat;\" background=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-bottom-right-vector.png\">\n" +
                        "              <td align=\"left\" style=\"margin:0;text-align:justify;padding-left:16px;padding-right:8px; float: left; padding-bottom: 48px;\" >\n" +
                        "                  <div align=\"left\">\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.facebook.com/ajaib.investasi/\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-facebook-logo.png\" alt=\"Facebook\" title=\"Facebook\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.instagram.com/ajaib_investasi/\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-instagram-logo.png\" alt=\"Instagram\" title=\"Instagram\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.youtube.com/channel/UCyQPkTAkLNk_n-NPJebmaIw\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-youtube-logo.png\" alt=\"YouTube\" title=\"YouTube\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://twitter.com/ajaib_investasi\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-twitter-logo.png\" alt=\"Twitter\" title=\"Twitter\" style=\"text-decoration:none;height:auto;border:0;display:block\" class=\"CToWUd\"></a></div>\n" +
                        "                </div>\n" +
                        "                <p style=\"padding-top: 4px;margin:0;text-align:left;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333; max-width: 330px;\">Copyright by Ajaib. Neo Soho @Podomoro City Lt. 30, Jl. Letjen S. Parman No.28, Jakarta Barat</p>\n" +
                        "                <a style=\"padding-top: 4px;margin:0;text-align:left;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#3a83f9;\" href=\"https://ajaib.co.id/email-disclaimer\">Terms of service</a>\n" +
                        "              </td>\n" +
                        "              <td align=\"right\" style=\"margin:0;text-align:justify;padding-right:16px; float: right;\">\n" +
                        "                <div align=\"center\" style=\"padding-right:0px;padding-left:0px\">\n" +
                        "                  <p style=\"margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">Terdaftar dan diawasi oleh OJK</p>\n" +
                        "                  <img align=\"center\" border=\"0\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-ojk-logo.png\"\n" +
                        "        style=\"text-decoration:none;height:auto;border:0;width:140px;max-width:100%;display:block\"\n" +
                        "        width=\"140\" class=\"CToWUd a6T\" tabindex=\"0\">\n" +
                        "                </div>\n" +
                        "              </td>\n" +
                        "             </tr> -->\n" +
                        "\n" +
                        "            <tr class=\"footer-mobile\" style=\"border-collapse:collapse;\">\n" +
                        "              <td style=\"margin:0;text-align:justify;padding-left:16px;padding-right:8px; padding-bottom: 32px;\" >\n" +
                        "                  <div style=\"text-align: center;\">\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.facebook.com/ajaib.investasi/\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-facebook-logo.png\" alt=\"Facebook\" title=\"Facebook\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.instagram.com/ajaib_investasi/\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-instagram-logo.png\" alt=\"Instagram\" title=\"Instagram\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://www.youtube.com/channel/UCyQPkTAkLNk_n-NPJebmaIw\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-youtube-logo.png\" alt=\"YouTube\" title=\"YouTube\" style=\"text-decoration:none;height:auto;border:0;display:block\"></a></div>\n" +
                        "                    <div style=\"display:inline-block;\" ><a href=\"https://twitter.com/ajaib_investasi\" target=\"_blank\"><img width=\"32\" height=\"32\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-twitter-logo.png\" alt=\"Twitter\" title=\"Twitter\" style=\"text-decoration:none;height:auto;border:0;display:block\" class=\"CToWUd\"></a></div>\n" +
                        "                </div>\n" +
                        "                <p style=\"padding-top: 4px;margin:0px 48px;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">Copyright by Ajaib. Neo Soho @Podomoro City Lt. 30, Jl. Letjen S. Parman No.28, Jakarta Barat</p>\n" +
                        "                <a style=\"display: block; padding-top: 4px;margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#3a83f9;\" href=\"https://ajaib.co.id/email-disclaimer\" target=\"_blank\">Terms of service</a>\n" +
                        "              </td>\n" +
                        "            </tr>\n" +
                        "            <tr class=\"footer-mobile\" style=\"border-collapse:collapse; background-image:url(https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-bottom-right-vector.png);\n" +
                        "        background-position:right bottom;background-repeat:no-repeat;background-size: 179px 80px;\" background=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-bottom-right-vector.png\">\n" +
                        "\n" +
                        "              <td style=\"margin:0;text-align:justify;padding-left:32px;padding-right:16px;padding-bottom: 48px;\">\n" +
                        "                <div align=\"center\" style=\"padding-right:0px;padding-left:0px\">\n" +
                        "                  <p style=\"margin:0;text-align:center;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:'Lato', sans-serif;line-height:26px;color:#333333;\">Terdaftar dan diawasi oleh OJK</p>\n" +
                        "                  <img align=\"center\" border=\"0\" src=\"https://ajaib-files.s3-ap-southeast-1.amazonaws.com/email_assets/verify-email-ojk-logo.png\"\n" +
                        "        style=\"text-decoration:none;height:auto;border:0;width:140px;max-width:100%;display:block\"\n" +
                        "        width=\"140\" class=\"CToWUd a6T\" tabindex=\"0\">\n" +
                        "                </div>\n" +
                        "              </td>\n" +
                        "             </tr>\n" +
                        "\n" +
                        "           </table>\n" +
                        "          </td>\n" +
                        "         </tr>\n" +
                        "\n" +
                        "       </table>\n" +
                        "       <!-- end 2021 footer-->\n" +
                        "  </div>\n" +
                        " </body>\n" +
                        "</html>")
                .build();
    }
}
