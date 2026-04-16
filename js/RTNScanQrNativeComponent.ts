import type {HostComponent, ViewProps} from 'react-native';
import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';
import {DirectEventHandler} from 'react-native/Libraries/Types/CodegenTypes';

type Event = Readonly<{
  value: string;
}>;

export interface NativeProps extends ViewProps {
  onQrScanned?: DirectEventHandler<Event>;
}

export default codegenNativeComponent<NativeProps>(
  'RTNScanQr',
) as HostComponent<NativeProps>;
