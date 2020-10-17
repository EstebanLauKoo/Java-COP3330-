/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author kwhiting
 */
public class Student implements IUcfStudent
{
    private boolean accepted;
    private int satScore;
    private int actScore;
    private String fName;
    private String lName;
    private String ssn;
    private DateOfBirth dob;
    private ArrayList edRecords;
    private boolean flResident;
    private static Instructor prof;
    
    public Student()
    {
        // explicit constructor invocation
        // calls the constructor below
        this(true);
        accepted = false;
    }
    
    public Student(boolean resident)
    {
        dob = new DateOfBirth();
        flResident = resident;
    }
    
    @Override
    public void apply()
    {
        // apply online
       
        if(!flResident)
        {
            accepted = false;
            return;
        }
        else
        {
            accepted = true;
        }
        System.out.println("end of apply");

        return;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void attendOrientation()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registerCourses()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makePayment()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void purchaseText()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the accepted
     */
    public boolean isAccepted()
    {
        return accepted;
    }

    /**
     * @param accepted the accepted to set
     */
    public void setAccepted(boolean accepted)
    {
        this.accepted = accepted;
    }

    /**
     * @return the satScore
     */
    public int getSatScore()
    {
        return satScore;
    }

    /**
     * @param satScore the satScore to set
     */
    public void setSatScore(int satScore)
    {
        this.satScore = satScore;
    }

    /**
     * @return the actScore
     */
    public int getActScore()
    {
        return actScore;
    }

    /**
     * @param actScore the actScore to set
     */
    public void setActScore(int actScore)
    {
        this.actScore = actScore;
    }

    /**
     * @return the fName
     */
    public String getfName()
    {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName)
    {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName()
    {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName)
    {
        this.lName = lName;
    }

    /**
     * @return the ssn
     */
    public String getSsn()
    {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn)
    {
        this.ssn = ssn;
    }

    /**
     * @return the dob
     */
    public DateOfBirth getDob()
    {
        return dob;
    }

    /**
     * @param dob the dob to set
     *  parameter name shadows the member variable name
     */
    public void setDob(DateOfBirth dob)
    {
        this.dob = dob;
    }

    /**
     * @return the edRecords
     */
    public ArrayList getEdRecords()
    {
        return edRecords;
    }

    /**
     * @param edRecords the edRecords to set
     */
    public void setEdRecords(ArrayList edRecords)
    {
        this.edRecords = edRecords;
    }

    /**
     * @return the flResident
     */
    public boolean isFlResident()
    {
        return flResident;
    }

    /**
     * @param flResident the flResident to set
     */
    public void setFlResident(boolean flResident)
    {
        this.flResident = flResident;
    }
    
}
