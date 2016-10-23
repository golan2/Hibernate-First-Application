package org.hibernate.tutorial.domain;


import java.util.Date;

/**
 * Tutorial:
 * http://docs.jboss.org/hibernate/core/3.3/reference/en/html/tutorial.html#tutorial-firstapp-mapping
 *
 *
 * <pre>
 * <B>Copyright:</B>   HP Software IL
 * <B>Owner:</B>       <a href="mailto:izik.golan@hp.com">Izik Golan</a>
 * <B>Creation:</B>    15/12/2011 23:32:52
 * <B>Since:</B>       BSM 9.1
 * <B>Description:</B>
 * <p/>
 * </pre>
 */
public class Event {
  private Long id;

    private String title;
    private Date date;

    public Event() {}

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
