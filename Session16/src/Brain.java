public class Brain {
    private String[] memory;

    public Brain()
    {
        memory = null;
    }
    public int getIQ() {
        if(!isBrainDamaged())
        {
            int a = memory[0].length();
            int p1 = memory[1].length();
            int p2 = memory[2].length();

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
        if (memory[0] == null || memory[1]==null || memory[2]==null)
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
        memory[2] = memory[1];
        memory[1] = memory[0];
        memory[0] = info;
    }

    public void refreshMemory(String info)
    {
        if (memory[1].equals(info))
        {
            memory[1] = memory[0];
            memory[0] = info;
        }
        else if(memory[2].equals(info))
        {
            remember(info);
        }
    }

    public boolean recall(String info)
    {
        if (memory[0].equals(info) || memory[1].equals(info) || memory[2].equals(info))
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
        return memory[0];
    }

    public String toString()
    {
        return "Active: " + memory[0] + " Passive 1: " +
                memory[1] + " Passive 2: " + memory[2];
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
            return other.equals(memory[0]) && other.equals(memory[1]) && other.equals(memory[2]);
        }
    }
}
