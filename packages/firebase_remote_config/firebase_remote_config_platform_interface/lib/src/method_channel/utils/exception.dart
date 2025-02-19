// ignore_for_file: require_trailing_commas
import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/services.dart';

import 'package:_flutterfire_internals/_flutterfire_internals.dart';

/// Catches a [PlatformException] and returns an [Exception].
///
/// If the [Exception] is a [PlatformException], a [FirebaseException] is returned.
Never convertPlatformException(Object exception, StackTrace stackTrace) {
  convertPlatformExceptionToFirebaseException(
    exception,
    stackTrace,
    plugin: 'firebase_remote_config',
  );
}
