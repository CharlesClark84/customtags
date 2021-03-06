package com.charlesclark.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class GreetingTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        long twelve = 12;
        if (timeOfDay < twelve) {
            out.println("Good Morning!");
        } else {
            out.println("Good Afternoon!");
        }
         DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
         Calendar calobj = Calendar.getInstance();
         String date = df.format(calobj.getTime());
         out.println("<br/>");
         out.println("<br/>");
         out.println("The date and time: " + date);
         if (date.equals(02/02/18)) {
             out.println("<br/>Happy Groundhogs day my man!");
         }


    }
}
