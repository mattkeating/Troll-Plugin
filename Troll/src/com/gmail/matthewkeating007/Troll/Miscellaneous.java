package com.gmail.matthewkeating007.Troll;

/**
*
* @author Connor Mahaffey
* https://github.com/CMahaff
*/

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class Miscellaneous {
	 public Miscellaneous(){

	    }

	    public void changeBlock(Location location, double shiftX, double shiftY, double shiftZ, Material material){

	        Block block;

	        Location location2 = new Location(location.getWorld(), location.getX(), location.getY(), location.getZ());
	        location2.setX(location2.getX() + shiftX);
	        location2.setY(location2.getY() + shiftY);
	        location2.setZ(location2.getZ() + shiftZ);
	        block = location2.getBlock();
	        block.setType(material);

	    }

}
