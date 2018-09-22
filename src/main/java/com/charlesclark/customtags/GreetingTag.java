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

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        long time = System.currentTimeMillis();
        long twelve = 12;
        if (time > twelve) {
            out.println("Good Morning Charles, time for sleep.");
        } else {
            out.println("Good Afternoon Charles, time to get up..");
        }
        out.println("");
        out.println("");
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
         String date = df.format(calobj.getTime());
         out.println(date);
         if (date.equals(02/02/18)) {
             out.println("Happy Groundhogs day my man!");
         }
        

    }
}
