/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class libtorrent implements libtorrentConstants {
  public static error_category system_category() {
    return new error_category(libtorrent_jni.system_category(), false);
  }

  public static error_category generic_category() {
    return new error_category(libtorrent_jni.generic_category(), false);
  }

  public static boolean op_eq(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_eq__SWIG_0(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_lt(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_lt__SWIG_0(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_eq__SWIG_1(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_lt(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_lt__SWIG_1(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_neq(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_neq__SWIG_0(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_neq(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_neq__SWIG_1(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_code code, error_condition condition) {
    return libtorrent_jni.op_eq__SWIG_2(error_code.getCPtr(code), code, error_condition.getCPtr(condition), condition);
  }

  public static boolean op_neq(error_code lhs, error_condition rhs) {
    return libtorrent_jni.op_neq__SWIG_2(error_code.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_condition condition, error_code code) {
    return libtorrent_jni.op_eq__SWIG_3(error_condition.getCPtr(condition), condition, error_code.getCPtr(code), code);
  }

  public static boolean op_neq(error_condition lhs, error_code rhs) {
    return libtorrent_jni.op_neq__SWIG_3(error_condition.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static long hash_value(error_code ec) {
    return libtorrent_jni.hash_value(error_code.getCPtr(ec), ec);
  }

  public static error_code make_error_code(errc_t e) {
    return new error_code(libtorrent_jni.make_error_code(e.swigValue()), true);
  }

  public static error_condition make_error_condition(errc_t e) {
    return new error_condition(libtorrent_jni.make_error_condition(e.swigValue()), true);
  }

  public static error_category get_libtorrent_category() {
    return new error_category(libtorrent_jni.get_libtorrent_category(), false);
  }

  public static error_category get_http_category() {
    return new error_category(libtorrent_jni.get_http_category(), false);
  }

  public static error_category get_system_category() {
    return new error_category(libtorrent_jni.get_system_category(), false);
  }

  public static error_category get_posix_category() {
    return new error_category(libtorrent_jni.get_posix_category(), false);
  }

  public static void throw_type_error() {
    libtorrent_jni.throw_type_error();
  }

  public static long_long_long_2_pair_vector get_filesizes(file_storage t, String p) {
    return new long_long_long_2_pair_vector(libtorrent_jni.get_filesizes(file_storage.getCPtr(t), t, p), true);
  }

  public static long peer_priority(tcp_endpoint e1, tcp_endpoint e2) {
    return libtorrent_jni.peer_priority(tcp_endpoint.getCPtr(e1), e1, tcp_endpoint.getCPtr(e2), e2);
  }

  public static void request_a_block(torrent t, peer_connection c) {
    libtorrent_jni.request_a_block(torrent.getCPtr(t), t, peer_connection.getCPtr(c), c);
  }

  public static int merkle_num_leafs(int arg0) {
    return libtorrent_jni.merkle_num_leafs(arg0);
  }

  public static int merkle_num_nodes(int arg0) {
    return libtorrent_jni.merkle_num_nodes(arg0);
  }

  public static int merkle_get_parent(int arg0) {
    return libtorrent_jni.merkle_get_parent(arg0);
  }

  public static int merkle_get_sibling(int arg0) {
    return libtorrent_jni.merkle_get_sibling(arg0);
  }

  public static void trim_path_element(String path_element) {
    libtorrent_jni.trim_path_element(path_element);
  }

  public static void throw_invalid_handle() {
    libtorrent_jni.throw_invalid_handle();
  }

  public static torrent_handle add_feed_item(session s, feed_item fi, add_torrent_params p) {
    return new torrent_handle(libtorrent_jni.add_feed_item__SWIG_0(session.getCPtr(s), s, feed_item.getCPtr(fi), fi, add_torrent_params.getCPtr(p), p), true);
  }

  public static torrent_handle add_feed_item(session s, feed_item fi, add_torrent_params p, error_code ec) {
    return new torrent_handle(libtorrent_jni.add_feed_item__SWIG_1(session.getCPtr(s), s, feed_item.getCPtr(fi), fi, add_torrent_params.getCPtr(p), p, error_code.getCPtr(ec), ec), true);
  }

  public static boolean is_read_operation(disk_io_job j) {
    return libtorrent_jni.is_read_operation(disk_io_job.getCPtr(j), j);
  }

  public static boolean operation_has_buffer(disk_io_job j) {
    return libtorrent_jni.operation_has_buffer(disk_io_job.getCPtr(j), j);
  }

  public static int source_rank(int source_bitmask) {
    return libtorrent_jni.source_rank(source_bitmask);
  }

  public static session_settings min_memory_usage() {
    return new session_settings(libtorrent_jni.min_memory_usage(), true);
  }

  public static session_settings high_performance_seed() {
    return new session_settings(libtorrent_jni.high_performance_seed(), true);
  }

  public static int plus_one(int val) {
    return libtorrent_jni.plus_one(val);
  }

  public static int minus_one(int val) {
    return libtorrent_jni.minus_one(val);
  }

  public static String print_entry(lazy_entry e, boolean single_line, int indent) {
    return libtorrent_jni.print_entry__SWIG_0(lazy_entry.getCPtr(e), e, single_line, indent);
  }

  public static String print_entry(lazy_entry e, boolean single_line) {
    return libtorrent_jni.print_entry__SWIG_1(lazy_entry.getCPtr(e), e, single_line);
  }

  public static String print_entry(lazy_entry e) {
    return libtorrent_jni.print_entry__SWIG_2(lazy_entry.getCPtr(e), e);
  }

  public static error_category get_bdecode_category() {
    return new error_category(libtorrent_jni.get_bdecode_category(), false);
  }

  public static int gzip_header(String buf, int size) {
    return libtorrent_jni.gzip_header(buf, size);
  }

  public static void stat_file(String f, file_status s, error_code ec, int flags) {
    libtorrent_jni.stat_file__SWIG_0(f, file_status.getCPtr(s), s, error_code.getCPtr(ec), ec, flags);
  }

  public static void stat_file(String f, file_status s, error_code ec) {
    libtorrent_jni.stat_file__SWIG_1(f, file_status.getCPtr(s), s, error_code.getCPtr(ec), ec);
  }

  public static void rename(String f, String newf, error_code ec) {
    libtorrent_jni.rename(f, newf, error_code.getCPtr(ec), ec);
  }

  public static void create_directories(String f, error_code ec) {
    libtorrent_jni.create_directories(f, error_code.getCPtr(ec), ec);
  }

  public static void create_directory(String f, error_code ec) {
    libtorrent_jni.create_directory(f, error_code.getCPtr(ec), ec);
  }

  public static void remove_all(String f, error_code ec) {
    libtorrent_jni.remove_all(f, error_code.getCPtr(ec), ec);
  }

  public static void remove(String f, error_code ec) {
    libtorrent_jni.remove(f, error_code.getCPtr(ec), ec);
  }

  public static boolean exists(String f) {
    return libtorrent_jni.exists(f);
  }

  public static long file_size(String f) {
    return libtorrent_jni.file_size(f);
  }

  public static boolean is_directory(String f, error_code ec) {
    return libtorrent_jni.is_directory(f, error_code.getCPtr(ec), ec);
  }

  public static void recursive_copy(String old_path, String new_path, error_code ec) {
    libtorrent_jni.recursive_copy(old_path, new_path, error_code.getCPtr(ec), ec);
  }

  public static void copy_file(String f, String newf, error_code ec) {
    libtorrent_jni.copy_file(f, newf, error_code.getCPtr(ec), ec);
  }

  public static String split_path(String f) {
    return libtorrent_jni.split_path(f);
  }

  public static String next_path_element(String p) {
    return libtorrent_jni.next_path_element(p);
  }

  public static String extension(String f) {
    return libtorrent_jni.extension(f);
  }

  public static String remove_extension(String f) {
    return libtorrent_jni.remove_extension(f);
  }

  public static void replace_extension(String f, String ext) {
    libtorrent_jni.replace_extension(f, ext);
  }

  public static boolean is_root_path(String f) {
    return libtorrent_jni.is_root_path(f);
  }

  public static String parent_path(String f) {
    return libtorrent_jni.parent_path(f);
  }

  public static boolean has_parent_path(String f) {
    return libtorrent_jni.has_parent_path(f);
  }

  public static String filename(String f) {
    return libtorrent_jni.filename(f);
  }

  public static String combine_path(String lhs, String rhs) {
    return libtorrent_jni.combine_path(lhs, rhs);
  }

  public static String complete(String f) {
    return libtorrent_jni.complete(f);
  }

  public static boolean is_complete(String f) {
    return libtorrent_jni.is_complete(f);
  }

  public static String current_working_directory() {
    return libtorrent_jni.current_working_directory();
  }

  public static String time_now_string() {
    return libtorrent_jni.time_now_string();
  }

  public static String log_time() {
    return libtorrent_jni.log_time();
  }

  public static ptime time_now() {
    return new ptime(libtorrent_jni.time_now(), false);
  }

  public static ptime time_now_hires() {
    return new ptime(libtorrent_jni.time_now_hires(), true);
  }

  public static ptime min_time() {
    return new ptime(libtorrent_jni.min_time(), true);
  }

  public static ptime max_time() {
    return new ptime(libtorrent_jni.max_time(), true);
  }

  public static time_duration seconds(long s) {
    return new time_duration(libtorrent_jni.seconds(s), true);
  }

  public static time_duration milliseconds(long s) {
    return new time_duration(libtorrent_jni.milliseconds(s), true);
  }

  public static time_duration microsec(long s) {
    return new time_duration(libtorrent_jni.microsec(s), true);
  }

  public static time_duration minutes(long s) {
    return new time_duration(libtorrent_jni.minutes(s), true);
  }

  public static time_duration hours(long s) {
    return new time_duration(libtorrent_jni.hours(s), true);
  }

  public static long total_seconds(time_duration td) {
    return libtorrent_jni.total_seconds(time_duration.getCPtr(td), td);
  }

  public static long total_milliseconds(time_duration td) {
    return libtorrent_jni.total_milliseconds(time_duration.getCPtr(td), td);
  }

  public static long total_microseconds(time_duration td) {
    return libtorrent_jni.total_microseconds(time_duration.getCPtr(td), td);
  }

  public static String unescape_string(String s, error_code ec) {
    return libtorrent_jni.unescape_string(s, error_code.getCPtr(ec), ec);
  }

  public static String escape_string(String str, int len) {
    return libtorrent_jni.escape_string(str, len);
  }

  public static String escape_path(String str, int len) {
    return libtorrent_jni.escape_path(str, len);
  }

  public static String maybe_url_encode(String url) {
    return libtorrent_jni.maybe_url_encode(url);
  }

  public static boolean need_encoding(String str, int len) {
    return libtorrent_jni.need_encoding(str, len);
  }

  public static String base64encode(String s) {
    return libtorrent_jni.base64encode(s);
  }

  public static String base32encode(String s) {
    return libtorrent_jni.base32encode(s);
  }

  public static String base32decode(String s) {
    return libtorrent_jni.base32decode(s);
  }

  public static void convert_path_to_posix(String path) {
    libtorrent_jni.convert_path_to_posix(path);
  }

  public static String read_until(String str, char delim, String end) {
    return libtorrent_jni.read_until(str, delim, end);
  }

  public static int hex_to_int(char in) {
    return libtorrent_jni.hex_to_int(in);
  }

  public static boolean is_hex(String in, int len) {
    return libtorrent_jni.is_hex(in, len);
  }

  public static String to_hex(String s) {
    return libtorrent_jni.to_hex__SWIG_0(s);
  }

  public static void to_hex(String in, int len, String out) {
    libtorrent_jni.to_hex__SWIG_1(in, len, out);
  }

  public static boolean from_hex(String in, int len, String out) {
    return libtorrent_jni.from_hex(in, len, out);
  }

  public static String convert_to_native(String s) {
    return libtorrent_jni.convert_to_native(s);
  }

  public static String convert_from_native(String s) {
    return libtorrent_jni.convert_from_native(s);
  }

  public static String integer_to_str(String buf, int size, long val) {
    return libtorrent_jni.integer_to_str(buf, size, val);
  }

  public static String make_magnet_uri(torrent_handle handle) {
    return libtorrent_jni.make_magnet_uri__SWIG_0(torrent_handle.getCPtr(handle), handle);
  }

  public static String make_magnet_uri(torrent_info info) {
    return libtorrent_jni.make_magnet_uri__SWIG_1(torrent_info.getCPtr(info), info);
  }

  public static void parse_magnet_uri(String uri, add_torrent_params p, error_code ec) {
    libtorrent_jni.parse_magnet_uri(uri, add_torrent_params.getCPtr(p), p, error_code.getCPtr(ec), ec);
  }

  public static boolean default_pred(String arg0) {
    return libtorrent_jni.default_pred(arg0);
  }

  public static boolean ignore_subdir(String leaf) {
    return libtorrent_jni.ignore_subdir(leaf);
  }

  public static void nop(int arg0) {
    libtorrent_jni.nop(arg0);
  }

  public static int get_file_attributes(String p) {
    return libtorrent_jni.get_file_attributes(p);
  }

  public static String get_symlink_path(String p) {
    return libtorrent_jni.get_symlink_path(p);
  }

  public static void add_files(file_storage fs, String file, long flags) {
    libtorrent_jni.add_files__SWIG_2(file_storage.getCPtr(fs), fs, file, flags);
  }

  public static void add_files(file_storage fs, String file) {
    libtorrent_jni.add_files__SWIG_3(file_storage.getCPtr(fs), fs, file);
  }

}
