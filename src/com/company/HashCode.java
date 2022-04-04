package com.company;

public class HashCode {

    private boolean booleanValue = true;
    private char charValue = 'm';
    private String stringValue = "MyHash";
    private long longValue = 34829245849498300l;
    private float floatValue = 345832400.93f;
    private double doubleValue = 98584292348454.9834;
    private byte[] arrayValue = {5, 6, 7};

    @Override
    public int hashCode() {
        int result=17;
        int value=booleanValue?0:1;
        result=result*31+value;
        result=result*31+(int)charValue;
        result=result*31+stringValue.hashCode();
        result=result*31+(int)(longValue - (longValue >>> 32));
        result=result*31+Float.floatToIntBits(floatValue);
        result=result*31+(int)(Double.doubleToLongBits(doubleValue)-(Double.doubleToLongBits(doubleValue)>>>32));
        result=result*31+(int)arrayValue[0];
        result=result*31+(int)arrayValue[1];
        result=result*31+(int)arrayValue[2];
        return result;



    }
}
