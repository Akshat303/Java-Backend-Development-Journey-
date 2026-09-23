package com.modifire.package2;

import com.modifire.package1.StudentProtected;

public class ChildProtected extends StudentProtected {
	public void show() {
		System.out.println("Child = " + name);
		display();
	}

	public static void main(String[] args) {
		ChildProtected child = new ChildProtected();
		child.show();
	}

}

/*

So remember:

protected
       ↓
Same Package ✅
       ↓
Different Package + Child Class ✅
       ↓
Normal Different Class ❌

*/

