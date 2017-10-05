using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Net;
using System.IO;

namespace ObterIp
{
    public class Ip
    {
        public static string GetPublicIP()
        {
            String direction = "";

            WebRequest request = WebRequest.Create("http://checkip.dyndns.org/");

            //WebRequest request = WebRequest.Create("https://wtfismyip.com/text");

            using (WebResponse response = request.GetResponse())
            using (StreamReader stream = new StreamReader(response.GetResponseStream()))
            {
                direction = stream.ReadToEnd();
            }

            //Search for the ip in the html
            int first = direction.IndexOf("Address: ") + 9;
            int last = direction.LastIndexOf("</body>");
            direction = direction.Substring(first, last - first);

            return direction;
        }
    }
}
