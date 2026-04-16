#import <React/RCTLog.h>
#import <React/RCTUIManager.h>
#import <React/RCTViewManager.h>

@interface RTNScanQrManager : RCTViewManager
@end

@implementation RTNScanQrManager

RCT_EXPORT_MODULE(RTNScanQr)
RCT_EXPORT_VIEW_PROPERTY(onQrScanned, RCTDirectEventBlock)

@end
