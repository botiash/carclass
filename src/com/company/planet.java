package com.company;
import java.util.Objects;

 public class planet extends galactic {
    private int count;

     public planet(String name, int count, int count1) {
         super(name, count);
         this.count = count1;
     }

     @Override
     void p_count(int count) {
         super.p_count(count);
     }

     @Override
     public String getName() {
         return super.getName();
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         if (!super.equals(o)) return false;
         planet planet = (planet) o;
         return count == planet.count;
     }

     @Override
     public int hashCode() {
         return Objects.hash(super.hashCode(), count);
     }
 }
