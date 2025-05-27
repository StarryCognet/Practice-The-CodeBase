import { defineConfig } from 'eslint/config';
import js from '@eslint/js';
import globals from 'globals';

export default defineConfig([
  // 配置 JavaScript 文件的规则
  {
    // 指定要检查的文件模式
    files: ['**/*.{js,mjs,cjs}'],
    // 使用的插件
    plugins: { js },
    // 继承推荐的 JavaScript 规则
    // extends: ['js/recommended'],
    // 自定义规则
    rules: {
      // 要求语句末尾使用分号
      // 'semi': ['error', 'always'],
      // 要求使用单引号
      'quotes': ['error', 'single'],
      // // 禁止使用 console
      // 'no-console': 'error',
      // // 禁止使用 debugger
      // 'no-debugger': 'error',
    },
  },
  // 配置浏览器环境的全局变量
  {
    // 指定要检查的文件模式
    files: ['**/*.{js,mjs,cjs}'],
    // 语言选项，指定全局变量
    languageOptions: {
      globals: globals.browser,
    },
  },
  // 配置 HTML 文件的规则
  // {
  //   // 指定要检查的文件模式
  //   files: ['**/*.html'],
  //   // 指定如何处理 HTML 文件
  //   processors: {
  //     html: 'eslint-plugin-html',
  //   },
  //   // 自定义规则
  //   rules: {
  //     // 要求语句末尾使用分号
  //     'semi': ['error', 'always'],
  //     // 要求使用单引号
  //     'quotes': ['error', 'single'],
  //     // 禁止使用 console
  //     'no-console': 'error',
  //     // 禁止使用 debugger
  //     'no-debugger': 'error',
  //     // 检查 HTML 语法
  //     'eslint-plugin-html/html-syntax': 'error',
  //     // 检查自闭合标签
  //     'eslint-plugin-html/html-self-closing': 'error',
  //     // 检查 HTML 注释
  //     'eslint-plugin-html/html-comments': 'error',
  //     // 检查 HTML 缩进
  //     'eslint-plugin-html/html-indent': 'error',
  //     // 检查 HTML 标签
  //     'eslint-plugin-html/html-tags': 'error',
  //     // 检查空 HTML 标签
  //     'eslint-plugin-html/html-void-tags': 'error',
  //     // 禁止内联样式
  //     'eslint-plugin-html/html-no-inline-styles': 'error',
  //     // 检查 <script> 标签内容
  //     'eslint-plugin-html/html-script-content': 'error',
  //     // 检查 <style> 标签内容
  //     'eslint-plugin-html/html-style-content': 'error',
  //   },
  // },
]);