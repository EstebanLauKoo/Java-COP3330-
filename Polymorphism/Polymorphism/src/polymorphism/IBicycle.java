/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism;

/**
 *
 * @author kwhiting
 */
public interface IBicycle 
{
    default public String identifyMyself() 
    {
        return "I am a bicycle.";
    }
}
