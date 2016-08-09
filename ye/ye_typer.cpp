#include <ApplicationServices/ApplicationServices.h>
#include <chrono>
#include <thread>
#include <time.h>

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

void msleep(int t) {
	std::this_thread::sleep_for(std::chrono::milliseconds(t));
}

int main()
{
	for (int i=0; i<20; i++) {
		usleep(1000000);
		sendPress(16);
		sendPress(14);
		sendPress(36);
	}
	sendControl(8);
	sleep(1);
	return 0;
}

