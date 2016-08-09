#include <iostream>
#include <cstdio>
#include <string>
#include <cstring>
#include <stdlib.h>
#include <math.h>
#include <ApplicationServices/ApplicationServices.h>
#define print(x) std::cout << x << std::endl
#define _USE_MATH_DEFINES


void sendPress(int kc) {

 CGEventSourceRef src = NULL;
//    CGEventSourceCreate(kCGEventSourceStateHIDSystemState);
	CGEventRef down, up;
	down = CGEventCreateKeyboardEvent(src,(CGKeyCode)kc, true);
	up = CGEventCreateKeyboardEvent(src,(CGKeyCode)kc, false);
	CGEventPost(kCGSessionEventTap, down);
	CGEventPost(kCGSessionEventTap, up);
	CFRelease(down);
	CFRelease(up);

}

void sendControl(int kc) {

 CGEventSourceRef src = NULL;
//    CGEventSourceCreate(kCGEventSourceStateHIDSystemState);
	CGEventRef down, up;
	down = CGEventCreateKeyboardEvent(src,(CGKeyCode)kc, true);
	CGEventSetFlags(down,kCGEventFlagMaskControl);
	up = CGEventCreateKeyboardEvent(src,(CGKeyCode)kc, false);
	CGEventSetFlags(up,kCGEventFlagMaskControl);
	CGEventPost(kCGSessionEventTap, down);
	CGEventPost(kCGSessionEventTap, up);
	CFRelease(down);
	CFRelease(up);

}

int main()
{
	for (int i=0; i<20; i++) {
		sleep(1);
		sendPress(16);
		sendPress(14);
		sendPress(36);
	}
	sendControl(8);
	sleep(1);
	return 0;
}

