<template>
    <a-config-provider
    :theme="{
      token: {
        colorPrimary: '#00b96b',
      },
    }"
  >
    <a-button />
  </a-config-provider>
  <div>
    <a-button type="primary" @click="openNotification('top')">
      <template #icon><BorderTopOutlined /></template>
      top
    </a-button>
    <a-button type="primary" @click="openNotification('bottom')">
      <template #icon><BorderBottomOutlined /></template>
      bottom
    </a-button>
    <a-button type="primary" @click="openNotification('topLeft')">
      <template #icon><radius-upleft-outlined /></template>
      topLeft
    </a-button>
    <a-button type="primary" @click="openNotification('topRight')">
      <template #icon><radius-upright-outlined /></template>
      topRight
    </a-button>
    <a-divider />
    <a-button type="primary" @click="openNotification('bottomLeft')">
      <template #icon><radius-bottomleft-outlined /></template>
      bottomLeft
    </a-button>
    <a-button type="primary" @click="openNotification('bottomRight')">
      <template #icon><radius-bottomright-outlined /></template>
      bottomRight
    </a-button>
  </div>
</template>
<script lang="ts" setup>
import {
  RadiusUpleftOutlined,
  RadiusUprightOutlined,
  RadiusBottomleftOutlined,
  RadiusBottomrightOutlined,
  BorderTopOutlined,
  BorderBottomOutlined,
} from '@ant-design/icons-vue';
import { notification } from 'ant-design-vue';
import type { NotificationPlacement } from 'ant-design-vue';
const openNotification = (placement: NotificationPlacement) => {
  notification.open({
    message: `Notification ${placement}`,
    description:
      'This is the content of the notification. This is the content of the notification. This is the content of the notification.',
    placement,
  });
};
</script>

