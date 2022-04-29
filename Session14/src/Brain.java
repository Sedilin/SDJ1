public class Brain {
    private String activeMemoryItem;
    private String passiveMemoryItemOne;
    private String passiveMemoryItemTwo;

    public Brain()
    {
        activeMemoryItem = " ";
        passiveMemoryItemOne = " ";
        passiveMemoryItemTwo = " ";
    }
    public int getIQ() {
        if(!isBrainDamaged())
        {
            int a = activeMemoryItem.length();
            int p1 = passiveMemoryItemOne.length();
            int p2 = passiveMemoryItemTwo.length();

            if (a>20 && p1 > 10 && p2 > 10 || p1 > 20 && a > 10 && p2 > 10 || p2 > 20 && p1 > 10 && a > 10)
            {
                return 130;
            }
            else if (a >=10 && p1 >=10 && p2 >=10)
            {
                return 100;
            }
            else
            {
                return 70;
            }
        }
        else
        {
            return 70;
        }
    }
    public boolean isBrainDamaged()
    {
        if (activeMemoryItem == null || passiveMemoryItemOne==null || passiveMemoryItemTwo==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void remember(String info)
    {
        passiveMemoryItemTwo = passiveMemoryItemOne;
        passiveMemoryItemOne = activeMemoryItem;
        activeMemoryItem = info;
    }

    public void refreshMemory(String info)
    {
        if (passiveMemoryItemOne.equals(info))
        {
            passiveMemoryItemOne = activeMemoryItem;
            activeMemoryItem = info;
        }
        else if(passiveMemoryItemTwo.equals(info))
        {
            remember(info);
        }
    }

    public boolean recall(String info)
    {
        if (activeMemoryItem.equals(info) || passiveMemoryItemOne.equals(info) || passiveMemoryItemTwo.equals(info))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String recall()
    {
        return activeMemoryItem;
    }

    public String toString()
    {
        return "Active: " + activeMemoryItem + " Passive 1: " +
                passiveMemoryItemOne + " Passive 2: " + passiveMemoryItemTwo;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Brain))
        {
            return false;
        }
        else
        {
            Brain other = (Brain) obj;
            return other.equals(activeMemoryItem) && other.equals(passiveMemoryItemOne) && other.equals(passiveMemoryItemTwo);
        }
    }
}
